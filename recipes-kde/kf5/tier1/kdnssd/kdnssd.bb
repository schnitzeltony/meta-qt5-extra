SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c4cb553fc24683425bd01ec0739ba20f"
SRC_URI[sha256sum] = "1db89b740dbf1041628c3eaeb9e9d3fe57e98d8ef98bf4bb79ba9feb1fa63aa0"
