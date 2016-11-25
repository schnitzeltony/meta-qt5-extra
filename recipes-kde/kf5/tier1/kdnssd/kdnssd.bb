SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c682939017dc4ad5dee2b3e362d40fa0"
SRC_URI[sha256sum] = "1940abb275db1c45d179f207913dfbea0fec27f14a79b5f234cad1873e7378be"
