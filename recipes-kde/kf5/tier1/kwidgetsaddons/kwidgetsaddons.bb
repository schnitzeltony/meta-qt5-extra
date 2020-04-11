SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "00315714e012a2f8a42bf380d55f5473"
SRC_URI[sha256sum] = "5fcc39eb17d832a14e8c2fe98ff26a300aa5c88013c63bcf8eef0017ca4eaf37"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
