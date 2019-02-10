SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d49e0c95cc12e210705f843b8c8ae624"
SRC_URI[sha256sum] = "63a03d12226e0f3f261fb3fa148110c9a14c81b96115c1ae6c6d794c2405ab9c"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
