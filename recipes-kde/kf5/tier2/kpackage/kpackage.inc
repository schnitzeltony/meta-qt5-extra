SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3754136eb861119e747d56d6d5c26bc5"
SRC_URI[sha256sum] = "59fe9c9ec38ec9afb0381921ad72593772d28273ad85469df20083731b05f90c"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
