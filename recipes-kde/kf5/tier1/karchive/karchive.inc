SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8f245b3ffc777368f7394cd06bb60b26"
SRC_URI[sha256sum] = "135fbfb2dfe107e4487723a5f887d1d074e13258a4583d592639366094aafe1a"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
