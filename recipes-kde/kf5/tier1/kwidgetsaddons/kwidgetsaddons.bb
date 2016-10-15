SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e3a44bed1791f6e0b5ac0b085b8af14b"
SRC_URI[sha256sum] = "343b0669cca8c87c1c2713e63e01de3ab84b5e21f3c40ce27dd11e7f94ed2f5d"
