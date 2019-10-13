SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c6eaedf7c5ab3d76eb2495dc0ae84b4f"
SRC_URI[sha256sum] = "cce332723324bf3991dc6e6ad8994ff96aae243631f7b4449505fb39f6d8efdb"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
