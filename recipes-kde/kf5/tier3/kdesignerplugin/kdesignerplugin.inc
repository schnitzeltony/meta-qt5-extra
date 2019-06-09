SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9330b5945822da085cfb9bdc21a7821c"
SRC_URI[sha256sum] = "b8a13a834fbcc7f4e7e4bb0d4e71ee2846d9660c02f3500b0f14c3a834649d3b"
