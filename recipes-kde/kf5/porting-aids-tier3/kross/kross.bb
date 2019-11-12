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
SRC_URI[md5sum] = "75d4e6f1e5cc0d84ec6e89f9bda698c7"
SRC_URI[sha256sum] = "d8a7e9fbeba4d16d6288d13d72a5f7581aa8be5894b06f83dbc6068b04551ebd"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
