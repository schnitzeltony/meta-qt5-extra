SUMMARY = "Multi-language application scripting"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcompletion \
    kcoreaddons \
    kcoreaddons-native \
    kdoctools \
    kdoctools-native \
    ki18n \
    kiconthemes \
    kio \
    kparts \
    kservice \
    kwidgetsaddons \
    kxmlgui \
    sonnet-native \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "2575200e6bcc0289f82579b12473c31d7027c46d114256b02485a6596565a600"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
