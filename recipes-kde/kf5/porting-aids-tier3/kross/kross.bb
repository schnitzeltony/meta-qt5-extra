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
SRC_URI[md5sum] = "48a3852d5168f8288dd5c5b14aa7acd9"
SRC_URI[sha256sum] = "ecc1f2ac39b4d9d53e52b30aca40cfc1d5b7cfc834a321f1e3dbd4d5e7bb515d"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
