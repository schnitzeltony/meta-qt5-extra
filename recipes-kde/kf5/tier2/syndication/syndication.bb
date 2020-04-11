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
SRC_URI[md5sum] = "3ef40807da2207803faecb3fcc4c9dba"
SRC_URI[sha256sum] = "eb38fbc7749efff7a06ee1454c0aaf4e0751bda2eaaf2587560e7d810f02972e"
