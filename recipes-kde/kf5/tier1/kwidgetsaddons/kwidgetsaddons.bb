SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "05f0c66e03250369f296dfedf99ae9b4"
SRC_URI[sha256sum] = "f4bcb1e22d8dfec214f4f55dbf4492229c4cb6ab63031f826ef68896c27ca6c0"
