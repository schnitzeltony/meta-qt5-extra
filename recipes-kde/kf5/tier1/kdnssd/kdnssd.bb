SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2bd111b8aa228fcaed274f2de4d9d7d7"
SRC_URI[sha256sum] = "fede0519a8d82bf1bc49cd486ec6c80e7f3cc42efa63dbc5c3591ce2ac9d4d71"
