SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "858de62bcace9ecff3c2088ec5fee2ac"
SRC_URI[sha256sum] = "bf6db9ebf47c73aa9a2f3175603dfdf0ae15d4f62929352ad9288df61310c741"
