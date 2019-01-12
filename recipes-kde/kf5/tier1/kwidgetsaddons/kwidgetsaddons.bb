SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9d1cb697c44a688a3a21e3fa554e792c"
SRC_URI[sha256sum] = "f009b49ae0eb6deaa814defcfbf7ed8a27b8d874a11a0754855fb917219d1d07"
