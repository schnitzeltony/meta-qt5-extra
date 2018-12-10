SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "113a86c053589b02024fe2e2052968b1"
SRC_URI[sha256sum] = "c9f5c73178ee76308d0b9e5eef3d1338dcb8b4fab64aff0b278e3e24d405ae01"
