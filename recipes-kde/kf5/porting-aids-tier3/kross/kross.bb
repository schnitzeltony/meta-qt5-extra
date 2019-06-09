SUMMARY = "Multi-language application scripting"
LICENSE = "LGPLv2.1"
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
SRC_URI[md5sum] = "567e73202c15287f26c3b9e7ac419735"
SRC_URI[sha256sum] = "0dff1001b4d667d03ada2cb96ced640918bf526a5ac7445674a2f86c85f478da"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
