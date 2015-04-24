SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f606ddeaea11257d3ce07e0747fcdb72"
SRC_URI[sha256sum] = "330a9ccd6838475f3bfb131a9a7d988a729875b0f1626ffd10430bb5c5dba20f"
