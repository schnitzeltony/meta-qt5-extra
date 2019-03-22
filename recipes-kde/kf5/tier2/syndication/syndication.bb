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
SRC_URI[md5sum] = "1d7c5865589f34626f6f093a39a5e85a"
SRC_URI[sha256sum] = "09874ad643da79c538592800d307ab8f2e8785032c0d885fac8f9355ae83d972"
