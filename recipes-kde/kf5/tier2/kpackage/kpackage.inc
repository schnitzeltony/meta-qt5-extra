SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "618adbd83861f261e8aff29920449d4d"
SRC_URI[sha256sum] = "ae848a72e789a80d4a9d0346e90cb1038ebc784da6e7ff645411edd878554ab5"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
