SUMMARY = "Syndication Library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += " \
    kcodecs \
"
PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "648d45de966dfedbf1f3d1693c0c660c"
SRC_URI[sha256sum] = "1be1bd32b4c75c6bb1b35d67cc7643089e0c525cb30e392220c1ac88240e7694"
