SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c9af5d1b21cb57fd882420f04e7bfb24"
SRC_URI[sha256sum] = "d294984b6a3f96459ec505002c3379bde862cf16d914e5f03dd7a620203d830e"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
