SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5f976708b03524154b39459233ffa121"
SRC_URI[sha256sum] = "a8197ca5b18afb38c393ea9191cf695d49be49bf35822bc6dba5a937bd7ac1c5"
