SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids gettext

DEPENDS += " \
    qtwebkit \
    kauth-native \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kio \
    kjobwidgets \
    kparts \
    kservice \
    kwallet \
    sonnet-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "703acf6d8db56896cb68760edcd823b3"
SRC_URI[sha256sum] = "f73d2599ce2269eaab45ddc11bdeb49dc887e950ded57454f3fd6499c370a777"

FILES_${PN} += "${libdir}/plugins"
