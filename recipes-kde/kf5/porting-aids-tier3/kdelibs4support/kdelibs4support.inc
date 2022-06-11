SUMMARY = "Porting aid from KDELibs4"
LICENSE = "GPL-2.0-only | LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "d726ebb00766d3d5ed39603601c4b9541659bebc4bb7b755eec25bffd8a76033"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DHAVE_GOOD_GETADDRINFO=ON \
"
