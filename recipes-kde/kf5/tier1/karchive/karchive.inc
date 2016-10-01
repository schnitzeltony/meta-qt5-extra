SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "33edd3478ca813a02aa7e525d6a1b9cc"
SRC_URI[sha256sum] = "af082dc3a8bd48302d5c36c0a70e2d2c796cb852e3f6ee64cb5059fb7f9adaeb"
