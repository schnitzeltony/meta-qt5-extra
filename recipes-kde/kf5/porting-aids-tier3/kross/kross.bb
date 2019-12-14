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
SRC_URI[md5sum] = "eeeedbbf06f6fe61244fedc8265e2f15"
SRC_URI[sha256sum] = "c7414c2d6bb959920c2dca01c2b50131a5715629e0229283f8e6dfcfae1a64a5"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
