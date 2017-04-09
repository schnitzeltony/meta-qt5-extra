SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a02b693f662defc2eb89d7f28f00187c"
SRC_URI[sha256sum] = "6170a0b2b3510b698281fc42f9b3ea656afe67a5a0e31e9be1e5269a6993b1dd"
