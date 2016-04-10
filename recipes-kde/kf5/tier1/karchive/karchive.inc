SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "125a68c6e5889f6423ecd3e08dbd80ae"
SRC_URI[sha256sum] = "6cdb32d995f691aed885f8e25a8393b548f17cc4223ffc0f727ad4ca83e05c10"
