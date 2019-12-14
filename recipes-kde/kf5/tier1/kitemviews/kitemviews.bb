SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9109bd9a4a20d5324d524312a02e110b"
SRC_URI[sha256sum] = "689f2517432861932a05b5c71e1c8c1378bee6773850e8a13a5907d0af58d5cb"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
