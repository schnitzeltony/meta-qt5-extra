SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8fe8dd2a382502a772c2d1cff449e534"
SRC_URI[sha256sum] = "2843ef166ff5bf69c1132bbc09545b59ad208313c0acad71d0cd951fde1d33de"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
