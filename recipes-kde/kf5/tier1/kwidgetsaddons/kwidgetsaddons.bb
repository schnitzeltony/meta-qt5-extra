SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e3b457924fcaecb0073216c0899b1167"
SRC_URI[sha256sum] = "a2d4a47489621d095c4979ea25d5d8304cf4004b10a892a2b314d74cd30cb5da"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
