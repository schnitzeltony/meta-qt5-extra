SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5d456438646adba8fb8e84bb5b5cc9ab"
SRC_URI[sha256sum] = "02c2406df66523fe7907f98a1d919fb03d285a0a56d3fc0ac77b83db33dbe054"
