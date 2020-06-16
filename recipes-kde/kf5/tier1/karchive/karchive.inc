SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "67a3b31f2cce390437019f0611c0a313"
SRC_URI[sha256sum] = "cc81e856365dec2bcf3ec78aa01d42347ca390a2311ea12050f309dfbdb09624"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
