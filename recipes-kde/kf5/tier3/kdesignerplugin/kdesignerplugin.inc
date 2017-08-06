SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2950d4d7107000daa97b58bb74c24ff9"
SRC_URI[sha256sum] = "1ba67344b46e1cb0809975f84c667019158e69ae1b884ab3a995ca1d8d434acf"
