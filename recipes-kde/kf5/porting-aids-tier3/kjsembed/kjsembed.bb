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
SRC_URI[md5sum] = "e79e8ddb0506abb91bebc23c51706b3c"
SRC_URI[sha256sum] = "58fe647901b69167b7c66a284c3181c2eda9c3b751548eb43bfe0795d10eb0ce"
