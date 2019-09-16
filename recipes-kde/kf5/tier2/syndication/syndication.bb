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
SRC_URI[md5sum] = "191bd9170b4f626f0e241db69bf489c0"
SRC_URI[sha256sum] = "d315a5a5e691925df44ce30abbd5208b764a72eb42d38dc5b5ca134d71c05462"
