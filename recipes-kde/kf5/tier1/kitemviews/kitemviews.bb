SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "319f2eae1a05f32de9bd5dd84cd56768"
SRC_URI[sha256sum] = "dfe37a7baf4069d18834485e2b5ce0a5fb3b22194bbe4d7e9f24c9c74de00096"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
