SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0de07e23650c60fd2d7bb5814061a0fa"
SRC_URI[sha256sum] = "026461fa2e3e0237a56eb18a2817453c788514578f27a4aa0832b85fe98a09ab"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
