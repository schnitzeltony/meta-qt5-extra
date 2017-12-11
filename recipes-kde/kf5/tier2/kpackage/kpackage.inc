SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e5bbc196ebb357071988c1a5bf660de2"
SRC_URI[sha256sum] = "b5fd12baf2de9d93ca245a7775052589dea88d0ade2299174ebe8ae2a1d6c398"
