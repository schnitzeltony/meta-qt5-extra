SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8d386da9f2e3a64018b979a8a0512a18"
SRC_URI[sha256sum] = "cd5a42101e5cc50f026f48002dc8125e0c898b148fea5fba4451023ec1e181ad"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
