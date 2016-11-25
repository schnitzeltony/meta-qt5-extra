SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += " \
    qtwebkit \
    kconfig \
    kcoreaddons \
    kio \
    kjobwidgets \
    kparts \
    kservice \
    kwallet \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9fc835dfc5aa9e1d8e79d10d1e2a2e10"
SRC_URI[sha256sum] = "8987e4088ec1a6d8cd1ab4504deebbdf6e2de31b48f8bcbac1bf750b5f33d8a6"
