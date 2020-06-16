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
SRC_URI[md5sum] = "1bdeb4aff6c5560546289ab95ea2d213"
SRC_URI[sha256sum] = "9352a31b5f735d71d6db4b09825ca01adb337e37f2b0cfce48c679e932238486"
