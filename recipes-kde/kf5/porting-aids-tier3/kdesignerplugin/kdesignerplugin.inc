SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ec617f1063545e85fa63e6aaf3baf81c"
SRC_URI[sha256sum] = "7af5b4647cd9a912422c705894a7c13eddc914e5b464f3ab81aab5b9fa0f2dfd"
