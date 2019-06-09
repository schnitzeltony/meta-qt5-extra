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
SRC_URI[md5sum] = "bfa10d80a543fc27359c8216b3102dfc"
SRC_URI[sha256sum] = "743c5a860a917b8f7746781b21df407511b3873a0074fba2f61291a951c5edc3"
