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
SRC_URI[md5sum] = "8bb72e9515b3ea074445249428e449c2"
SRC_URI[sha256sum] = "c515fd48d3736b55c8e7990c72471bfddd55363c4bcb049713be741eaa7b07e0"
