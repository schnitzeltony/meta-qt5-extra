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
SRC_URI[md5sum] = "dbf70f7f3c502999fd248e8345fbacaa"
SRC_URI[sha256sum] = "cea7c8f735f7c20b1c35124d4b8d2ab44494d24ca20ba0c408492156f97cfe59"
