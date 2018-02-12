SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b7d41f77d01102fef52fab13c25038cb"
SRC_URI[sha256sum] = "4b0025fac04f69fec88b6068ac20c4b64267b1b71fc7c360f67bfd73f1fc27db"
