SUMMARY = "Syndication Library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += " \
    kcodecs \
"
PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0fe62a714eadf8e52a0f99e49ad647ae"
SRC_URI[sha256sum] = "cbe4bfbbfdd90401574a6c60463ffa08083ad14efac0d0ed888c04d85e46d27e"
