SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c8a40fb1e43e35b1202e63c3cc46169f"
SRC_URI[sha256sum] = "681958b30d52c23008068c445acaf8a55a1ef5612922986ceee0106ca2e0977e"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
