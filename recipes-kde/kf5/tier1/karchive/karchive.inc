SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb8d65acddcd0eb582a77773b2de0e46"
SRC_URI[sha256sum] = "4e3d2a6ba551c6ada44a6517150e031df92691919119bc3b5eb4efc741ff7564"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
