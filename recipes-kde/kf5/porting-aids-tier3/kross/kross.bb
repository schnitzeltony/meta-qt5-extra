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
SRC_URI[md5sum] = "7a3854f1c5afdbf21d0aa691d5b4ed27"
SRC_URI[sha256sum] = "bbfafe4abd2c2166f31eb36daa1849f4dc4a829c06fe85402e1fad0ce875c667"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
