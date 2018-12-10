SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "81b62cf06f46166c16c194c88a2cc0fe"
SRC_URI[sha256sum] = "794350830a213336f5488e54916a81e71d1271e1cd65de92e3becffc550a7949"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
