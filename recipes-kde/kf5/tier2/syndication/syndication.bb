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
SRC_URI[md5sum] = "e9a1a9979961f54ceee41304ac0ce761"
SRC_URI[sha256sum] = "5e6c90360461b820a48069af2838cffbcbedfe8bcd042535823e1cf1b43cd6b7"
