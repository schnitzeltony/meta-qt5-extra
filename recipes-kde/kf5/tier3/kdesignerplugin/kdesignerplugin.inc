SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0154eed53e6101a9f76e8cf8f5338e6e"
SRC_URI[sha256sum] = "b43cb9e9a80fb96c5d0711a7c856405aa253bf9dd7e4e22f4e831682feadd631"
