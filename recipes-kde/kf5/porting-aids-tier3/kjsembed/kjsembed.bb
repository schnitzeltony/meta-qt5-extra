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
SRC_URI[md5sum] = "a9a1b9eb54b520e6f252b92e589a533c"
SRC_URI[sha256sum] = "7bde7a742c05c5ba0b8faef4681dcec0a0b91ad0a3c7cc3cdd3cfa94c0c16e52"
