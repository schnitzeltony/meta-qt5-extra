SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d8c20050abd157c665b5a6cd41a70d51"
SRC_URI[sha256sum] = "457ed420449630625cb161fcc9bedc7c6a16527f48d6db4008aea76cdb948387"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
