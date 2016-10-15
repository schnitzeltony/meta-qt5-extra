SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "85d8be54f0c19125c201b8fcb6a51169"
SRC_URI[sha256sum] = "0ac9b24fa94240cff53cde2a9ef565c0f85d9883087b8f7c815b83aacd119338"
