SUMMARY = "ZynAddSubFX is an open source software synthesizer"
HOMEPAGE = "http://zynaddsubfx.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=21fa88a5e50a1c608d22612c1fbe1971"

inherit cmake qemu pkgconfig gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    qemu-native \
    virtual/libx11 \
    alsa-lib \
    jack \
    portaudio-v19 \
    dssi \
    lv2 \
    liblo \
    zlib \
    fltk fltk-native \
    mxml \
    libxpm \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-No-target-specific-asm.patch \
    file://0002-Controller-Spliter-align-Makefiles-for-cross-compili.patch \
    file://0003-Nio.cpp-Do-not-use-ps-aux-to-find-jack-busybox-s-ps-.patch \
    file://0004-Keep-our-build-flags.patch \
"
SRC_URI[md5sum] = "7dc757512e5b6f3013bfb168ed01cfa3"
SRC_URI[sha256sum] = "014b1d9ad1750c310369676b46a4555ba6bec512c38ccba17ceb89c78552949a"

do_configure_prepend() {
    # We cannot run lv2-ttl-generator in cross environment so keep commands in 
    # shell script. Builddir is deleted so keep our script in ${WORKDIR}

	# manipulate CMakeLists.txt to keep commands in script
    sed -i 's|lv2-ttl-generator $<TARGET_FILE.*|echo \"&\" >> ${WORKDIR}/lv2-ttl-generator-data|g' `find ${S} -name CMakeLists.txt`
}


# slightly reworked qemu_run_binary: qemu.bbclass expects binary in sysroot but
# our binary is not (yet) installed
# ${@qemu_run_binary_local(d, '$D', '/usr/bin/test_app')} [test_app arguments]
#
def qemu_run_binary_local(data, rootfs_path, binary):
    qemu_binary = qemu_target_binary(data)
    if qemu_binary == "qemu-allarch":
        qemu_binary = "qemuwrapper"

    libdir = rootfs_path + data.getVar("libdir", False)
    base_libdir = rootfs_path + data.getVar("base_libdir", False)
    qemu_options = data.getVar("QEMU_OPTIONS", True)

    return "PSEUDO_UNLOAD=1 " + qemu_binary + " " + qemu_options + " -L " + rootfs_path\
            + " -E LD_LIBRARY_PATH=" + libdir + ":" + base_libdir + " "\
            + binary

do_compile_append() {
    # Build Controller/Spliter
    oe_runmake -C ${S}/ExternalPrograms/Controller
    oe_runmake -C ${S}/ExternalPrograms/Spliter

    # build ttl-files must be done in quemu (lv2-ttl-generator-data loads 
    # so-files and calls functions to create ttl-files)
    for sofile in `cat ${WORKDIR}/lv2-ttl-generator-data | awk '{ print $2 }'`; do
        cd `dirname ${sofile}`
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${B}/src/Plugin/lv2-ttl-generator')} ${sofile}
    done
}

do_install_append() {
    install -m 0755 ${S}/ExternalPrograms/Controller/controller ${D}${bindir}/zynaddsubfx-controller
    install -m 0755 ${S}/ExternalPrograms/Spliter/spliter ${D}${bindir}/zynaddsubfx-spliter
}

# we are not linking against dssi - so
RDEPENDS_${PN} += "dssi"

FILES_${PN} += " \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
