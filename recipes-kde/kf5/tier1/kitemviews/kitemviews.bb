SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cc5e9c1716a816d8f18c8ceaf5995afa"
SRC_URI[sha256sum] = "c848a39526d6332b5eab84400c6b9cbdaba2e04bbb4db32e3bb0f8c1f6ac7413"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
