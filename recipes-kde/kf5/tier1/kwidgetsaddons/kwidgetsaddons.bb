SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a6166da9293a41803b80aff1ebc528e9"
SRC_URI[sha256sum] = "4d0c209fae36f0342aeae4f3d2f402a89566eab1cee0afa5e612c88ae5d01ba6"
