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
SRC_URI[sha256sum] = "c889a3f8ceef51f8ad188e8cc98d7aae110268d23ff4ade8d7ef779bb90f5e6d"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
