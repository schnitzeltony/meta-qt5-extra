SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "541071a7a336ca167d66b6bee5bb98a0"
SRC_URI[sha256sum] = "c0d6df96d86d2a8f21e3c3f67200755eabd5a86efc3d72b56f522fa11ae62fdc"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
