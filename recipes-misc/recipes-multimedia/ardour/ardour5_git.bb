SUMMARY = "Ardour is a multi-channel digital audio workstation"
HOMEPAGE = "http://ardour.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

DEPENDS += " \
    gettext-native \
    gtk+ \
    gtkmm \
    cppunit \
    jack \
    alsa-lib \
    fftw \
    vamp-plugin-sdk \
    aubio \
    taglib \
    boost \
    virtual/libx11 \
    dssi \
    zlib \
    lrdf \
    rubberband \
    suil \
    lilv \
    libarchive \
    libltc \
    qm-dsp \
    fluidsynth \
"

inherit wafold distro_features_check gtk-icon-cache pkgconfig

REQUIRED_DISTRO_FEATURE = "x11"

SRC_URI = " \
    git://github.com/Ardour/ardour.git \
    file://0001-remove-all-build-flags-that-cause-trouble-for-cross-.patch \
    file://0002-Use-ARM-NEON-intrinsics-if-available-for-mixing-func.patch \
    file://0003-Prevent-excessive-meter-redraws-for-inactive-meters-.patch \
    file://0004-Prevent-excessive-meter-redraws-for-inactive-meters-.patch \
    file://0005-Follow-fluidsynth-s-API-changes-introduced-with-2.0..patch \
    file://ardour5.desktop \
"
SRCREV = "ae0dcdc0c5d13483271065c360e378202d20170a"
PV = "5.12"
S = "${WORKDIR}/git"


# arch specific override - default (tested) is ARM -> no fpu-optimizations
# can be something like i686 / x86_64 see file 'wscript' in sourcepath for more details
BUILD_DIST_TARGET ??= "none"

EXTRA_OECONF = " \
    --configdir=${sysconfdir} \
    --libdir=${libdir} \
    --optimize \
    --cxx11 \
    --no-phone-home \
    --use-external-libs \
    --qm-dsp-include=${STAGING_INCDIR}/qm-dsp \
    \
    --with-backends="jack,alsa" \
    --dist-target=${BUILD_DIST_TARGET} \
"

do_install_append() {
    # install icons to freedesktop locations
    for s in 16 22 32 48 256 512; do
        install -d  ${D}${datadir}/icons/hicolor/${s}x${s}/apps
        ln -s ../../../../${BPN}/resources/Ardour-icon_${s}px.png \
            ${D}${datadir}/icons/hicolor/${s}x${s}/apps/${BPN}.png
    done

    # install .desktop
    install -d  ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/ardour5.desktop ${D}${datadir}/applications
}

FILES_${PN} += " \
    ${datadir}/${BPN} \
    ${libdir}/${BPN} \
"

FILES_${PN}-dev += " \
    ${libdir}/${BPN}/libardour.so \
    ${libdir}/${BPN}/libardouralsautil.so \
    ${libdir}/${BPN}/libaudiographer.so \
    ${libdir}/${BPN}/libcanvas.so \
    ${libdir}/${BPN}/libevoral.so \
    ${libdir}/${BPN}/libgtkmm2ext.so \
    ${libdir}/${BPN}/libmidipp.so \
    ${libdir}/${BPN}/libpbd.so \
    ${libdir}/${BPN}/libptformat.so \
    ${libdir}/${BPN}/libwaveview.so \
    ${libdir}/${BPN}/libwidgets.so \
    ${libdir}/${BPN}/vamp/*.so \
"

FILES_${PN}-staticdev += " \
    ${libdir}/${BPN}/*.a \
"
