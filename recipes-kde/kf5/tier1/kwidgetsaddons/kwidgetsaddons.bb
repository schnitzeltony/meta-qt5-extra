SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "35ae8fcd2707ca37cf74e63daa2198ec"
SRC_URI[sha256sum] = "311d8274469f03b1938da5a4f7ad17c82e3f96bc79ec28624cb748b13403f451"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
