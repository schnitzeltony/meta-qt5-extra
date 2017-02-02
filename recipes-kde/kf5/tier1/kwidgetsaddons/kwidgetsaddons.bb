SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "675f5bf1fff1ac5a0716852d713b58ed"
SRC_URI[sha256sum] = "34c322aa53a33ed883d8082e2435cd9464fb9d3f63e50c4a81d87166088fc24a"
