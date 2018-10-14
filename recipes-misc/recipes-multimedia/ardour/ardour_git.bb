SUMMARY = "Ardour is a multi-channel digital audio workstation"
HOMEPAGE = "http://ardour.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

# It is a V6 already
ARDOUR_VER = "6"

DEPENDS += " \
    gettext-native \
    itstool-native \
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

inherit waf distro_features_check gtk-icon-cache pkgconfig

REQUIRED_DISTRO_FEATURE = "x11"

SRC_URI = " \
    git://github.com/Ardour/ardour.git \
    file://0001-remove-all-build-flags-that-cause-trouble-for-cross-.patch \
    file://0002-Use-ARM-NEON-intrinsics-if-available-for-mixing-func.patch \
    file://0003-Follow-fluidsynth-s-API-changes-introduced-with-2.0..patch \
    file://0004-Make-itstool-work.patch \
"
SRCREV = "2a9af2d2f6aa9025adabf2f9bc6e42c65b43c08a"
PV = "5.12+git${SRCPV}"
S = "${WORKDIR}/git"


# arch specific override - default (tested) is ARM -> no fpu-optimizations
# can be something like i686 / x86_64 see file 'wscript' in sourcepath for more details
BUILD_DIST_TARGET ??= "none"

EXTRA_OECONF = " \
    --configdir=${sysconfdir} \
    --libdir=${libdir} \
    --optimize \
    --freedesktop \
    --no-phone-home \
    --use-external-libs \
    --qm-dsp-include=${STAGING_INCDIR}/qm-dsp \
    \
    --with-backends="jack,alsa" \
    --dist-target=${BUILD_DIST_TARGET} \
"

do_configure_prepend() {
    # force full path for itstool
    sed -i 's:%sysroot_bindir%:${STAGING_BINDIR_NATIVE}:g' ${S}/gtk2_ardour/wscript
}

do_install_append() {
    # install icons to freedesktop locations
    for s in 16 22 32 48 256 512; do
        install -d  ${D}${datadir}/icons/hicolor/${s}x${s}/apps
        ln -s ../../../../${BPN}${ARDOUR_VER}/resources/Ardour-icon_${s}px.png \
            ${D}${datadir}/icons/hicolor/${s}x${s}/apps/${BPN}${ARDOUR_VER}.png
    done
    # install .desktop
    install -d  ${D}${datadir}/applications
    install -m 0644 ${S}/build/gtk2_ardour/${BPN}${ARDOUR_VER}.desktop ${D}${datadir}/applications
}

FILES_${PN} += " \
    ${datadir}/${BPN}${ARDOUR_VER} \
    ${libdir}/${BPN}${ARDOUR_VER} \
"

FILES_${PN}-dev += " \
    ${libdir}/${BPN}${ARDOUR_VER}/libardour.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libardouralsautil.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libaudiographer.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libcanvas.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libevoral.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libgtkmm2ext.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libmidipp.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libpbd.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libptformat.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libtemporal.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libwaveview.so \
    ${libdir}/${BPN}${ARDOUR_VER}/libwidgets.so \
    ${libdir}/${BPN}${ARDOUR_VER}/vamp/libardourvampplugins.so \
"

FILES_${PN}-staticdev += " \
    ${libdir}/${BPN}${ARDOUR_VER}/*.a \
"

RPROVIDES_${PN} += "${PN}5"
RREPLACES_${PN} += "${PN}5"
RCONFLICTS_${PN} += "${PN}5"

