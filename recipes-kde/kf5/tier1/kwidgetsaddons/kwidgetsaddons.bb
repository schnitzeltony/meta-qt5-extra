SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7e6a7218dff9b1282e65c1df08759d0b"
SRC_URI[sha256sum] = "5aa6f4002e6f1302f272b3839513debefafd51b7f3a9249f6ef2c5f30cec5a34"
