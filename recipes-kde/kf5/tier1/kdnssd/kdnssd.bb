SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e4ec36c45fa8ed7f45eea5a38ba76aa6"
SRC_URI[sha256sum] = "21554c6faf2f7136fb8f7a2908340c120ed0d5dc1475f5aeb8cafed1e4228009"
