SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9feb5965a5438ea7900b10b6734b6b5d"
SRC_URI[sha256sum] = "8475efa46cdc054d9fb6336e42c6075fb037921a9147d4e5aa564a5e58b79fd2"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
