SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cce5a567097e0c52d35ea0884c61d1ad"
SRC_URI[sha256sum] = "7b0e31c272658a2849cb279422e9e522f5d878b1d2f14c5ab00f78d2f347dcfc"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
