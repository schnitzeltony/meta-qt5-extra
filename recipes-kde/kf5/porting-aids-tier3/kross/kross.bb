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
SRC_URI[md5sum] = "babd193992c4865ea2eeba9f0c91f988"
SRC_URI[sha256sum] = "e83f3388ca8e89057e272b3b98233f294528ed0dcb62a6edb6cf37b7a1891f45"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
