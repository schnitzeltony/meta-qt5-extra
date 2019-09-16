SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4acf9f1011f42ecd78a6a0916f2288a9"
SRC_URI[sha256sum] = "99980ebdc16dd9ac062fcfda0974c0ce894c09a395caf914518646ffdc48e3ca"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
