SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "681afd14a1c294795d509930418b83d0"
SRC_URI[sha256sum] = "281a6cea68d19d56f8506e839e450d6652604e49ab70b540e29828b50adbcad6"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
