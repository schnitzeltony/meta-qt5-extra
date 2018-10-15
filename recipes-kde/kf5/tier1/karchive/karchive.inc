SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c321826780ab330af4ddc64404b7f429"
SRC_URI[sha256sum] = "7667430451d0530b38532ee023e645d5ff66f2078352d39129f803dd7d0328b3"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
