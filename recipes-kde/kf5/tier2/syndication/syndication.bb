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
SRC_URI[md5sum] = "65ab7595092ff5726e1f20d3afe4855c"
SRC_URI[sha256sum] = "0d9ae4b6eecf5310f580df05f2f1ab6da2d4b17d1e616a46ad0893d6341d9e9a"
