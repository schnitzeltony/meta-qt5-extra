SUMMARY = "Collection of synthesizers and plugins"
HOMEPAGE = "http://distrho.sourceforge.net/ports"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://doc/GPL.txt;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://doc/LGPL.txt;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

SRC_URI = " \
    git://github.com/DISTRHO/DISTRHO-Ports.git \
    file://0001-disable-pitchedDelay-it-uses-double-precision-SSE2-b.patch \
    file://0002-Refine-Plugin-do-not-include-xmmintrin.h.patch \
    file://0003-do-not-build-equinox-LV2-plugin-lv2_ttl_generator-bl.patch \
    file://0004-do-not-build-drowaudio-tremolo-LV2-plugin-lv2_ttl_ge.patch \
    file://0005-do-not-build-drumsynth-LV2-plugin-lv2_ttl_generator-.patch \
    file://0006-do-not-build-HiReSam-LV2-plugin-lv2_ttl_generator-bl.patch \
    file://0007-do-not-build-dexed-LV2-plugin-lv2_ttl_generator-bloc.patch \
    \
    http://linuxsynths.com/ObxdPatchesDemos/ObxdPatchesBrian-01.tar.gz;name=linuxsynths-obxd-patches1;subdir=linuxsynths-obxd-patches \
    \
    http://linuxsynths.com/VexPatchesDemos/VexPatches01.tar.gz;name=linuxsynths-vex-patches1;subdir=linuxsynths-vex-patches \
    http://linuxsynths.com/VexPatchesDemos/VexPatches02.tar.gz;name=linuxsynths-vex-patches2;subdir=linuxsynths-vex-patches \
"

SRCREV = "e11e2b204c14b8e370a0bf5beafa5f162fedb8e9"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

SRC_URI[linuxsynths-obxd-patches1.md5sum] = "32244f847a54a71ee3c25079df5c8b84"
SRC_URI[linuxsynths-obxd-patches1.sha256sum] = "246fccadd71bb9f0606a95bf7b0aee7807fd3a14f754367425423a51c31e160e"

SRC_URI[linuxsynths-vex-patches1.md5sum] = "c03f8ac9eaf3fabb3c98af5cb27a5edb"
SRC_URI[linuxsynths-vex-patches1.sha256sum] = "1a32ba4ba52d0efcd2214e52ecf9ea71885d110261c2b26e23ccdbd0960b6f60"
SRC_URI[linuxsynths-vex-patches2.md5sum] = "a3d00bf9eb7e2381ffc56f3e79e067ec"
SRC_URI[linuxsynths-vex-patches2.sha256sum] = "378cff261dab333c5f29246b6f3f557e0461e8bc230519da3a1a9049cbd437d5"

REQUIRED_DISTRO_FEATURES = "x11"

inherit qemu-ext distro_features_check

DEPENDS += " \
    premake3-native \
    alsa-lib \
    libx11 \
    libxext \
    libxcursor \
    freetype \
    ladspa-sdk \
"

CLEANBROKEN = "1"

do_configure_prepend() {
	# manipulate scripts to keep lv2_ttl_generator-calls in script for qemu
    sed -i 's|$GEN ./$FILE|echo `pwd`/$FILE >> ${WORKDIR}/lv2_ttl_generator-data|g' `find ${S} -name *.sh`
}

# platforms supporting sse2 can override this
do_configure() {
    NOOPTIMIZATIONS=1 ${S}/scripts/premake-update.sh linux
}

do_compile_append() {
    # build ttl-files must be done in quemu
    for sofile in `cat ${WORKDIR}/lv2_ttl_generator-data`; do
        cd `dirname ${sofile}`
        echo "QEMU lv2_ttl_generator for ${sofile}..."
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/libs/lv2_ttl_generator')} ${sofile} || echo "ERROR: for QEMU lv2_ttl_generator for ${sofile}!"
    done
}

do_install() {
    install -d ${D}${libdir}
	cp -r ${S}/bin/* ${D}${libdir}
    # don't install crash data
    rm `find ${D}${libdir} -name *.core` || true

    # presets
    install -d ${D}${libdir}/lv2
    # obxd
    for file in `find ${WORKDIR}/linuxsynths-obxd-patches -mindepth 1 -maxdepth 1` ; do
        cp -rf $file ${D}${libdir}/lv2/
    done
    # vex
    for file in `find ${WORKDIR}/linuxsynths-vex-patches -mindepth 1 -maxdepth 1` ; do
        cp -rf $file ${D}${libdir}/lv2/
    done
}

PACKAGES =+ "${PN}-presets"
RDEPENDS_${PN}-presets = "${PN}"

FILES_${PN} += " \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

FILES_${PN}-presets = "${libdir}/lv2/*.preset.lv2"

# Have not found what causes stripping - debugging of plugins is unlikely
INSANE_SKIP_${PN} = "already-stripped"
