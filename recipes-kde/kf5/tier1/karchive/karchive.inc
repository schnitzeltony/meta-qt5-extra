SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3f0a5580b368394800b6707564e41e0b"
SRC_URI[sha256sum] = "3da2eab8f14e9d995e467ba6c20186d7eadd06f2cff946c569b716bb1a648950"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
