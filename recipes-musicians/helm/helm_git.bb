SUMMARY = "Helm - a free polyphonic synth with lots of modulation"
HOMEPAGE = "http://tytel.org/helm/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qemu-ext distro_features_check gtk-icon-cache pack_audio_plugins

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    virtual/libx11 \
    virtual/libgl \
    libxext \
    libxinerama \
    libxcursor \
    curl \
    alsa-lib \
    jack \
    freetype \
    hicolor-icon-theme \
"

SRC_URI += " \
    git://github.com/mtytel/helm.git \
    file://0001-do-not-create-ttl-files-it-won-t-work-fo-cross.patch \
    file://0002-set-VECTORIZE_LOOP-for-gcc.patch \
    file://0003-use-single-precision-floats-it-performs-much-better.patch \
"
SRCREV = "927d2ed27f71a735c3ff2a1226ce3129d1544e7e"
PV = "0.9.0"
S = "${WORKDIR}/git"

CXXFLAGS += "-I ${STAGING_INCDIR}/freetype2"

do_configure_prepend() {
    # not easy to patch:
    # * the place is platered all over
    # * we have some <CR><LF> around
    OIFS="$IFS"
    IFS=$'\n'
    for f in `find ${S} -name '*Makefile*' -o -name '*.jucer'`; do
        if [ -f "$f" ] ; then
            sed -i 's:-L/usr/X11R6/lib/::g' "$f"
            sed -i 's:libraryPath="/usr/X11R6/lib/"::g' "$f"
        fi
    done
    IFS="$OIFS"
}

do_compile() {
    oe_runmake 'SIMDFLAGS='
    ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/builds/linux/LV2/lv2_ttl_generator')} ${S}/builds/linux/LV2/build/helm.so
    cp *.ttl ${S}/builds/linux/LV2/helm.lv2/
}

do_install() {
    oe_runmake 'DESTDIR=${D}' 'SIMDFLAGS=' 'LIBDIR=${libdir}' 'VSTDIR=${D}${libdir}/vst' install
    rm -f ${datadir}/helm/patches/*.patch
    rm -f ${datadir}/helm/patches/series
}

PACKAGES =+ "${PN}-standalone"

FILES_${PN}-standalone = " \
    ${datadir}/applications \
    ${datadir}/icons \
    ${bindir} \
"

RDEPENDS_${PN}-standalone += "${PN}"
RDEPENDS_${PN}-lv2 += "${PN}"
RDEPENDS_${PN}-vst += "${PN}"
