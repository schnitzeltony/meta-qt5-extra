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
SRC_URI[md5sum] = "68bb1721691de4416eb721374922617a"
SRC_URI[sha256sum] = "db78cf8b167562a211c20a081e23540d0613d2e6feec67d461bb9fc982ad6be8"

FILES_${PN} += "${libdir}/plugins"
