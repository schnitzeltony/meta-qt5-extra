SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "338c6a5bcdd3bf7762f52258041fd30a"
SRC_URI[sha256sum] = "b4ff96b4ec6365e5f9e4da5e651da99be491799a4e6cfd982d0838dda39844ac"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
