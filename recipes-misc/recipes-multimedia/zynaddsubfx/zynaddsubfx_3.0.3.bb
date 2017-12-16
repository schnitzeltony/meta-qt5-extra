SUMMARY = "ZynAddSubFX is an open source software synthesizer"
HOMEPAGE = "http://zynaddsubfx.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=21fa88a5e50a1c608d22612c1fbe1971"

inherit cmake qemu-ext pkgconfig gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
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
    ntk \
"

CLEANBROKEN = "1"

CXXFLAGS += "-ffast-math -DNDEBUG"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-No-target-specific-asm.patch \
    file://0002-Controller-Spliter-align-Makefiles-for-cross-compili.patch \
    file://0003-Nio.cpp-Do-not-use-ps-aux-to-find-jack-busybox-s-ps-.patch \
    file://0004-Keep-our-build-flags.patch \
    file://0005-Set-UI-optimization-to-O1-explicitly.patch \
"
SRC_URI[md5sum] = "66acae0913108f129aa979f3c4b65473"
SRC_URI[sha256sum] = "11de448f9664076e9e8f2bcb8f7f45bf54a13516b7d6693da1ef8c511b8ed7c1"

do_configure_prepend() {
    # We cannot run lv2-ttl-generator in cross environment so keep commands in 
    # shell script. Builddir is deleted so keep our script in ${WORKDIR}

	# manipulate CMakeLists.txt to keep commands in script
    sed -i 's|../../lv2-ttl-generator|lv2-ttl-generator|g' `find ${S} -name CMakeLists.txt`
    sed -i 's|lv2-ttl-generator $<TARGET_FILE.*|echo \"&\" >> ${WORKDIR}/lv2-ttl-generator-data|g' `find ${S} -name CMakeLists.txt`
}


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

FILES_${PN} += " \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
