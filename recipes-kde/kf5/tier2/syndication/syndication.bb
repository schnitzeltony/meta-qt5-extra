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
SRC_URI[md5sum] = "59240be3b390227198e8d94f5ae87fe8"
SRC_URI[sha256sum] = "4844606b7dcaf9fabe6a45047d420c98cdecb2544f2cf740642746d89439f919"
