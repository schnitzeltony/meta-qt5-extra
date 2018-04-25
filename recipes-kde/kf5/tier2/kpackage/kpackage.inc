SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "07975bbf6fd54a279b8e6fee7d47ce8b"
SRC_URI[sha256sum] = "6f3f65eebb45ee07180032bac82d2a3f8b123fc331a44c9b1e3436848cbdb535"
