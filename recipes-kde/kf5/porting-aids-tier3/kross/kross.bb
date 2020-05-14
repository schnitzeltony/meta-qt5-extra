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
SRC_URI[md5sum] = "6d619e298ac3a8b8d6b30a5020b2c128"
SRC_URI[sha256sum] = "e59859824aaee9207819aa82e463dae9d2c8d46a7e047383208e6511e8116589"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
