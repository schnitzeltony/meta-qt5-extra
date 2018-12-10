SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "532cd48d56e1adc7f716d4721a78bfe1"
SRC_URI[sha256sum] = "2a272077b595639d4880fcbcab4b7102aa08db1a5083bb219f746be24f5c94be"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
