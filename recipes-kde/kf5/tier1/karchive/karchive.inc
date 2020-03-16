SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8a0d996d039c89ac449a7268052fbf87"
SRC_URI[sha256sum] = "518f07629d87e5778e1d8ce066f5590941472d9fffa7bd74819759be5c6edf0d"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
