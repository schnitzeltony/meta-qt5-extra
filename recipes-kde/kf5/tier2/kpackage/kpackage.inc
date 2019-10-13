SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d79b365e78df7cff13c7053ee7d8023a"
SRC_URI[sha256sum] = "050b7f942ef0ce8ea99c1bddb119ee41905a70c2a5d52a9af63a4ea9599ca7c0"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
