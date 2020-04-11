SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c700b36ebd85b9d35df06045691b716b"
SRC_URI[sha256sum] = "1a9555eadb72909adbf512e476db29abb5223e736b3c3b77b47753c1138aa039"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
