SUMMARY = "Helm - a free polyphonic synth with lots of modulation"
HOMEPAGE = "http://tytel.org/helm/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit autotools-brokensep qemu distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "virtual/libx11 libxext alsa-lib freetype qemu-native"

SRC_URI = " \
    git://github.com/mtytel/helm.git \
    file://0001-remove-msse2-compiler-switch.patch \
    file://0002-remove-all-absolute-paths.patch \
    file://0003-do-not-create-ttl-files-it-won-t-work-fo-cross.patch \
"
SRCREV = "352fba329cd8342e801969c0adb3b2103b3d5700"
PV = "0.8.6+git${SRCPV}"
S = "${WORKDIR}/git"

CXXFLAGS += "-I ${STAGING_INCDIR}/freetype2"

# slightly reworked qemu_run_binary: qemu.bbclass expects binary in sysroot but
# we run it before copying to sysroot
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
    ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/builds/linux/LV2/lv2_ttl_generator')} ${S}/builds/linux/LV2/build/helm.so
    cp *.ttl ${S}/builds/linux/LV2/helm.lv2/
}

FILES_${PN} += "${libdir}/lv2"
