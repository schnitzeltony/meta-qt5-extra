SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5c759116a6fd6e9ccb760c8c7668f4be"
SRC_URI[sha256sum] = "f5f361a2ce857d7e7af49276ab70506c6a2ece45a183971ed9abdd5386d50a7d"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
