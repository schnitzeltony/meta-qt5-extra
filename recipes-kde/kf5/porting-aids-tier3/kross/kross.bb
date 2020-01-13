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
SRC_URI[md5sum] = "1e1054d34525eb9e2b87d3f54a476e09"
SRC_URI[sha256sum] = "109159996da54ec52ec8114ff05f88bdee6428e49ca84515ab73c457e0005ebc"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
