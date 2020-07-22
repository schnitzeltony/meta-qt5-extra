SUMMARY = "Syndication Library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    kcodecs \
"
PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "055a4f58980abdaf141e72aa092edd24"
SRC_URI[sha256sum] = "9c990e08ef95d730a201bb9efb62a34d3ad51ee0d09c7d5b466b27f05637e339"
