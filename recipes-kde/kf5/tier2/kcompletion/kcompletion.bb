SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d2e45f8b12bc4f8dfb51f5e4b3b8ad2a"
SRC_URI[sha256sum] = "fa50bb46867cbbb531d7ed1ed306f201526155ff13a7e47ed1ad697c333670b8"
