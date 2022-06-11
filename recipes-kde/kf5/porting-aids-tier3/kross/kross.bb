SUMMARY = "Multi-language application scripting"
LICENSE = "LGPL-2.1-only"
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
SRC_URI[sha256sum] = "1d6925bd2530ded6ea97f832fda42de0e24d1d7302e52262171fd0461f642d49"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
