SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "207f1f9e0b46b21bdca90f7aaefa16c4"
SRC_URI[sha256sum] = "a7d6f63951b776ca552c4051147a6bbb416f996561f639c3a41946734853e486"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
