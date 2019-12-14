SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7edf0a0c0f09e6e2a120d7e607898673"
SRC_URI[sha256sum] = "f5124ae8beb1da1ec5cca979b862c398635ee84e87283a7f528978df928a971d"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
