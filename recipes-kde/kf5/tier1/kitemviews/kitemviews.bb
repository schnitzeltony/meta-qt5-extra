SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "be56db58cd6537fe3a138f2b04fdf5c7"
SRC_URI[sha256sum] = "0b3f8a0116c042ae187b67f35ffd40872352b91f5f236d19dd26ffad8db83fee"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
