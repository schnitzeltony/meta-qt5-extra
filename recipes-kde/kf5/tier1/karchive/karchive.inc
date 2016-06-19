SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7d21c57bebdd6800143c1b03b4f9b4c3"
SRC_URI[sha256sum] = "3b3e310ae2aceae0513e809e4fc559bea5262cd26ecbe43071388cc1de5e30ef"
