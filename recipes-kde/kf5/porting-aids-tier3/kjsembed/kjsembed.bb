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
SRC_URI[md5sum] = "8dbb6955e804e71c0ee4ba1311107c5f"
SRC_URI[sha256sum] = "1e9a97c03007e20aaad631cf1cfcdc3d5950cab5dd9aa189b6fad03c21e70c86"
