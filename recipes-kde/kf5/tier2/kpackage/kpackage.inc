SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6584c84e23d1761396b69d2db1c02bdf"
SRC_URI[sha256sum] = "ebef00a26a0c95a912797c927137e2a23570be525abf5650db93d023473e36e8"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
