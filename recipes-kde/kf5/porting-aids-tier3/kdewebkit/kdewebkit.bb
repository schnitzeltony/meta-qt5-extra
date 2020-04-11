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
SRC_URI[md5sum] = "732db8d56e643d731dc0beb6be1328e4"
SRC_URI[sha256sum] = "1922d80c2398c9da4e8db8dc321eb6961cf55cf94b4918e137182c86251113d2"

FILES_${PN} += "${libdir}/plugins"
