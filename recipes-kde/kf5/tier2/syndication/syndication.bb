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
SRC_URI[md5sum] = "6ae961850a1b03864824b64b3b69699b"
SRC_URI[sha256sum] = "ba4c185f4a0457b7365baa7a48a5d8eb3b2b10336f83e735dea5a5a045725588"
