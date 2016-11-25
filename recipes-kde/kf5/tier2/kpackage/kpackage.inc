SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ee7f38c05409f05eb8a4b05c1777d4a4"
SRC_URI[sha256sum] = "c4112bedb7975899ab091768fe3a41a0ab4394af6fefc156c1a05b6f57bb37b4"
