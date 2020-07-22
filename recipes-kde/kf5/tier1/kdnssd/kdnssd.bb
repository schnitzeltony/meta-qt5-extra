SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9d1028cc96d883d4e8aa10df56d6f5b1"
SRC_URI[sha256sum] = "1db9bfe04a30200b614c82d0f9280b7392b76ad3c4b7809a7e8a95dbd0a50bfc"
