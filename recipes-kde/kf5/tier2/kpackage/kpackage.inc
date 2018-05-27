SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "de6d426f6091c513986d5db4b37ea50b"
SRC_URI[sha256sum] = "0cdd96f179c43dc8dd083e02c9ef9ffbffe7d97a6f83177870811c05a0fc85e0"
