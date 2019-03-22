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
    \
    http://linuxsynths.com/ObxdPatchesDemos/ObxdPatchesBrian-01.tar.gz;name=linuxsynths-obxd-patches1;subdir=linuxsynths-obxd-patches \
    \
    http://linuxsynths.com/VexPatchesDemos/VexPatches01.tar.gz;name=linuxsynths-vex-patches1;subdir=linuxsynths-vex-patches \
    http://linuxsynths.com/VexPatchesDemos/VexPatches02.tar.gz;name=linuxsynths-vex-patches2;subdir=linuxsynths-vex-patches \
"

SRCREV = "a82fff059baafc03f7c0e8b9a99f383af7bfbd79"
S = "${WORKDIR}/git"
PV = "2018-04-16"

SRC_URI[linuxsynths-obxd-patches1.md5sum] = "32244f847a54a71ee3c25079df5c8b84"
SRC_URI[linuxsynths-obxd-patches1.sha256sum] = "246fccadd71bb9f0606a95bf7b0aee7807fd3a14f754367425423a51c31e160e"

SRC_URI[linuxsynths-vex-patches1.md5sum] = "c03f8ac9eaf3fabb3c98af5cb27a5edb"
SRC_URI[linuxsynths-vex-patches1.sha256sum] = "1a32ba4ba52d0efcd2214e52ecf9ea71885d110261c2b26e23ccdbd0960b6f60"
SRC_URI[linuxsynths-vex-patches2.md5sum] = "a3d00bf9eb7e2381ffc56f3e79e067ec"
SRC_URI[linuxsynths-vex-patches2.sha256sum] = "378cff261dab333c5f29246b6f3f557e0461e8bc230519da3a1a9049cbd437d5"

REQUIRED_DISTRO_FEATURES = "x11 opengl"

inherit lv2-postinst-helper distro_features_check pack_audio_plugins

DEPENDS += " \
    premake3-native \
    virtual/libgl \
    alsa-lib \
    libx11 \
    libxext \
    libxcursor \
    freetype \
    ladspa-sdk \
"

do_configure() {
    # reconfigure?
    if [ ! -f ${LV2-TURTLE-BUILD-DATA} ] ; then
        # keep unmodified scripts
        cp -r ${S}/scripts ${WORKDIR}
        # manipulate scripts to keep lv2_ttl_generator-calls in script for lv2-postinst-helper
        sed -i 's|$GEN ./$FILE|echo "lv2-ttl-generator `pwd`/$FILE" >> ${LV2-TURTLE-BUILD-DATA}|g' `find ${S}/scripts -name *.sh`
    else
        rm -f ${LV2-TURTLE-BUILD-DATA}
    fi

    # platforms supporting sse2 can override this (NOOPTIMIZATIONS)
    NOOPTIMIZATIONS=1 ${S}/scripts/premake-update.sh linux
}

do_install() {
    install -d ${D}${libdir}
	cp -r ${S}/bin/* ${D}${libdir}

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

    # install scripts for distro-ports-extra (and abuse libdir to ensure is is found in sysroot)
    install -d ${D}/${libdir}/distrho-ports-build
    cp -rf ${WORKDIR}/scripts ${D}${libdir}/distrho-ports-build/
    cp -rf ${S}/libs ${D}${libdir}/distrho-ports-build/
    rm -f ${D}${libdir}/distrho-ports-build/libs/lv2_ttl_generator
}

PACKAGES =+ "${PN}-presets"
RDEPENDS_${PN}-presets = "${PN}-lv2"

FILES_${PN}-presets = "${libdir}/lv2/*.preset.lv2"

# dummy pack scripts for distrho-ports-extra
FILES_${PN}-staticdev += " \
    ${libdir}/distrho-ports-build \
"
RDEPENDS_${PN}-staticdev = "bash perl"

# Have not found what causes stripping - debugging of plugins is unlikely
INSANE_SKIP_${PN} = "already-stripped"
