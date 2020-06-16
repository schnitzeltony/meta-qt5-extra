SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c527f9fcf4601aaa125201956900b00a"
SRC_URI[sha256sum] = "897077995bcf4125d0f90d2964500e718d2a3fd5f117e1b7906177ad13a5082e"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
