SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c6a893aa761a4b55ac04c4f095d0d504"
SRC_URI[sha256sum] = "bc269f0a74eee99d6c49550fc608450ced753a599cd03f77ea577af4c2e87958"
