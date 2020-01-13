SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "72b03090787e1fc192efaca137911a3f"
SRC_URI[sha256sum] = "9622337a513fcb8f0b5100c218b9fa85617f92024e5d7feada6d071f58a329e3"
