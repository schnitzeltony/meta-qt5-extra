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
SRC_URI[md5sum] = "d98a681ae0f56f8f74a4693d3a9fd832"
SRC_URI[sha256sum] = "5e45a7866b28d69e6d28f821011c020e53cc6e5b59bcdb7a5d9cb7bda37175e4"

FILES_${PN} += "${libdir}/plugins"
