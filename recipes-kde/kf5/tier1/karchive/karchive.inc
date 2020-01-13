SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "86dc6aa717e8b58f0372a193f0d547d5"
SRC_URI[sha256sum] = "434f315af624d315b06a35ba5e71e570f36ca454af891833d6e896e42edf23d8"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
