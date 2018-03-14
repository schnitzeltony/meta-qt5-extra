SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "67b0c4f58cbb2f26c2bf4be4a14752c7"
SRC_URI[sha256sum] = "24be6b134f80cbf11f1a15568e3022bf005ebe8fcf4202d9755c9e680f1da4a3"
