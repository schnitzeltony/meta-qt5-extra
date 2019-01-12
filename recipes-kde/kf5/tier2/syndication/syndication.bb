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
SRC_URI[md5sum] = "5c99c6c7d0545db5e91310f5cbe054d6"
SRC_URI[sha256sum] = "a87f0878f5f9f6090d66212bf96f8810d5a1215ee25136763a4e1709c1b6487e"
