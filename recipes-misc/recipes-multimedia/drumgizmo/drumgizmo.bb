require ${BPN}.inc

inherit autotools-brokensep pkgconfig distro_features_check

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
"

# --disable-editor: sigh - editor requires Qt4
EXTRA_OECONF = " \
    --enable-lv2 \
    --without-debug \
    --disable-sse \
"

FILES_${PN} += "${libdir}/lv2"
