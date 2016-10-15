SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0ef4ffdf00a9e25d086ec1a9e927feaa"
SRC_URI[sha256sum] = "1becf2f3f31e73640dd1090d558ef415dbc8884ccc47c1b71d464bb48bb7f494"
