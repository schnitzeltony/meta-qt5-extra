SUMMARY = "KHTML"
LICENSE = "GPLv3 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative gettext

DEPENDS += " \
    gperf-native \
    kauth-native \
    karchive \
    kcodecs \
    kconfig-native \
    kcoreaddons-native \
    kglobalaccel \
    ki18n \
    kiconthemes \
    kio \
    kjs \
    knotifications \
    kparts \
    sonnet \
    ktextwidgets \
    kwallet \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
    phonon \
    sonnet-native \
    jpeg \
    giflib \
    libpng \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "248a4a4990f3230b4d410f6265348c39"
SRC_URI[sha256sum] = "7d381c2a7d15710b4ba404111135c1aadbd3fc8027ad77f153b81a5208c3acf2"

do_compile_append() {
    # gperf-native sets absolut debug comments/links in header
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/kentities-gperf.h
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/doctypes.h
}

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
