SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dff98a7d06474ab2ccb9d355119cede2"
SRC_URI[sha256sum] = "9e6cdb2cf10407fd435b97eb284ac56ad1bca95f0b1789a8bc26c9cee7edcc52"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
