SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eb32378feb1444825581bc61c9861286"
SRC_URI[sha256sum] = "cec24dc289636e12eff8d24e2d3d9600b87c79af5645d1a9a9c34f8b3a9257c1"
