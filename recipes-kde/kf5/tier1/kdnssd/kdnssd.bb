SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a7a306c634c133dc0b48fdd9e5db5322"
SRC_URI[sha256sum] = "57504b89b327e0c4439c1be8037e13aba588155d5201adb3e81a1b52f8e28e1e"
