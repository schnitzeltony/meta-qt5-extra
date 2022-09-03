SUMMARY = "Porting aid from KDELibs4"
LICENSE = "GPL-2.0-only | LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "1adfdd09e61dd183de1dfbd1cd24e26ef69ab6429a0cfc292992a7f240244111"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DHAVE_GOOD_GETADDRINFO=ON \
"
