SUMMARY = "Porting aid from KDELibs4"
LICENSE = "GPL-2.0 | LGPL-2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "ea1a7e50e36fee629e4d9b1bf44bf27a169174d95dc36d37d4af82a5cf50e432"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DHAVE_GOOD_GETADDRINFO=ON \
"
