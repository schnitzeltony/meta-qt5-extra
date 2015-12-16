SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "972c4187b37644a4f8f491d759f01b2c"
SRC_URI[sha256sum] = "3f4c1762f5793f5a33a6f72f658e725f7f2edc73fbc9e2d44b4ebf4054d4876c"
