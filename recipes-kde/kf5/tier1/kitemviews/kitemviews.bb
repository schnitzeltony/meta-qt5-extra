SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "97b9e6af2298186ad620c0ae26f6a425"
SRC_URI[sha256sum] = "9e17697ccdfd6abc6199abdaa23e6869a0904eb284d285bb2a2c3e1f2d0f6947"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
