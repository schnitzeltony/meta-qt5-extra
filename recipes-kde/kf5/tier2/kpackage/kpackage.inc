SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c14083ea9e5c8ba7a58dc88786ba4bf7"
SRC_URI[sha256sum] = "49727d89f1ca7ee504397d6e8b5cd25c26cd0061596b26d8ab2b64e3987d2d16"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
