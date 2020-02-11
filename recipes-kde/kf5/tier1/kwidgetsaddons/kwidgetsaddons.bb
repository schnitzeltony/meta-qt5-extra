SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9616a12c63a1c65562e7f5b5fcb29e07"
SRC_URI[sha256sum] = "87f6287d08e419f24f7d120ec2e87cd2fb8788c38eacd62bb5b2eaf7bf4d8404"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
