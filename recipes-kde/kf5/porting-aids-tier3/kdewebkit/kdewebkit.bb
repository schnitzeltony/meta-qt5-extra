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
SRC_URI[md5sum] = "17c328c3ef757089fbf2f40fa5d607fb"
SRC_URI[sha256sum] = "82525a8fda1e9e2e7cde348b6e7227b0747f93d75a7648f4863e0e6889640586"

FILES_${PN} += "${libdir}/plugins"
