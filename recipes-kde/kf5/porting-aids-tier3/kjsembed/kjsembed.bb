SUMMARY = "Embedded JS"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids gettext

DEPENDS += " \
    qtsvg \
    qttools \
    kjs \
    ki18n \
    kdoctools \
    kdoctools-native \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "fa55d3bf0b3f9026eb573cc909b1fbe53bea7090f3da465e9bb293dc0f81d424"
