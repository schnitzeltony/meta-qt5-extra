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
SRC_URI[md5sum] = "2a0fe6cd135fbf6fbb8feda6b43e89f3"
SRC_URI[sha256sum] = "ac42ed4ec39ddaea0a4668803271f6f5de513fcdd1243d02b296544ab601bb1c"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
