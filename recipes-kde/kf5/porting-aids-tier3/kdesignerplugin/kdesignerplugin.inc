SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "9ff333f7d0432219b654bc4bb31cc3b152961dbc91454bdea7d522d6d11b0fb2"
