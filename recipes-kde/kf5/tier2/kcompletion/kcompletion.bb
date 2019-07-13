SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "30d0925015e0e80de704aef5571d6897"
SRC_URI[sha256sum] = "d5afb075661dfe2da5e300bd73dee89f92736f39859be711f186310bed245f7c"
