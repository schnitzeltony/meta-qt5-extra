SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
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
SRC_URI[md5sum] = "4b2e27b0f7cc8c380b2811e36c4273f9"
SRC_URI[sha256sum] = "706b3448694143484393dfa4c05953e832c83757d84d17d47d02e36f137f351f"
