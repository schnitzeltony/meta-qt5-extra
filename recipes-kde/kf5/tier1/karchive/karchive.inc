SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a20a04635883aa262fc5a05e4d05eea6"
SRC_URI[sha256sum] = "8f28ab8a8f7236ae5e9e6cf35263dbbb87a52ec938d35515f073bc33dbc33d90"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
