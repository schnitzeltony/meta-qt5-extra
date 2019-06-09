SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "48fc132eb9102827258cd0b31940d66c"
SRC_URI[sha256sum] = "69e22fd0a685386a0c00dd4b3865471affbd8a947bba5b2e70bd8eb42a82f3bb"
