SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d0d8ac3bbf1e7600d1d24f5d0720f9b9"
SRC_URI[sha256sum] = "0887882000eeef5c12bb613672075187b1f031e8d87dbaecdadc02c9112a8a2f"
