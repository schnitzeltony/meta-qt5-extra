SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6fba4ecd91c3f2ddff1adcaad45b36d0"
SRC_URI[sha256sum] = "ec512226309be1f44c527cb940d6995214611617f12c49ec7b6c3aaa3786933a"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
