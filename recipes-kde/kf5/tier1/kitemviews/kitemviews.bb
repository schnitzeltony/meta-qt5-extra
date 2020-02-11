SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "76990691b3c57e9c02c5da55144764a4"
SRC_URI[sha256sum] = "487b993eee35b6b4fcdf121f2c5de0df78b7d6b08c8243f1e0543c5ba9c3c50d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
