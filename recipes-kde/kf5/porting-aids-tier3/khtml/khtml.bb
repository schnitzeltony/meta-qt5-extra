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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "219bda94e78e969e9feaacbd0e0f0105"
SRC_URI[sha256sum] = "fe35153e0d89ca984fe6609ce2365a94eb21849e9d69e201a195af36d40e4639"

do_compile_append() {
    # gperf-native sets absolut debug comments/links in header
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/kentities-gperf.h
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/doctypes.h
}

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
