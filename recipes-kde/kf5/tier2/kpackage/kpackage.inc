SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6bf9110d2c3746fdf0c70cc8451c3596"
SRC_URI[sha256sum] = "55ab8e9e2546a65aff1ed7203d203f3a4ec1d17adfc77abaee74ff73823da6e3"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
