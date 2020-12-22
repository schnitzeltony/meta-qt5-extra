SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "463fd7997e9177ca5f9b7a6533f8331960e51c6c8b7e88636e12267cd174b823"
