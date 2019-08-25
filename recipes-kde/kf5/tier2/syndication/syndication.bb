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
SRC_URI[md5sum] = "fd8a4690fb00e3e627554394d948a1f7"
SRC_URI[sha256sum] = "2803b2960dd23492ad002e0f23563c9f06500ddc144dd0be2e3e0ef2f6c1f576"
