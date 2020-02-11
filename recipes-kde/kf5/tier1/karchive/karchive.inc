SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ca01da6d4bedb8fbe9b99600f8f45ed2"
SRC_URI[sha256sum] = "d6b8bc7d05dcb437dddfebd46d539d51eefe05bb0903cc13628770d80183ed82"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
