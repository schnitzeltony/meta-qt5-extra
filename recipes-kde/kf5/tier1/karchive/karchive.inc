SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f59a872a6e78bd6e38272918d3f6f985"
SRC_URI[sha256sum] = "fa733531ddc6059eb92d4eaceb5b84177ee832e9303afdf229bf25da979ffe7a"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
