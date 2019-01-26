require ${BPN}.inc

inherit autotools-brokensep pkgconfig distro_features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += " \
    ${BPN}-native \
    libx11 \
    libxext \
    lv2 \
    libsmf \
    alsa-lib \
    libsndfile1 \
    zita-resampler \
    jack \
"

SRC_URI += " \
    file://0001-automake-enable-subdir-objects.patch \
    file://0002-Use-native-rcgen.patch \
    file://drumgizmo.desktop \
"

# --disable-editor: sigh - editor requires Qt4
EXTRA_OECONF = " \
    --enable-lv2 \
    --without-debug \
    --disable-sse \
"

do_install_append() {
    install -d ${D}${datadir}/pixmaps
    install -m 0644 ${S}/plugingui/resources/logo.png ${D}${datadir}/pixmaps/drumgizmo-logo.png

    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/${BPN}.desktop ${D}${datadir}/applications/
}

FILES_${PN} += "${libdir}/lv2"
