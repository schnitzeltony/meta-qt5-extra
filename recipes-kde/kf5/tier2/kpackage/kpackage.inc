SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e7c3358ac7976f6a745ee2a0cf1ed0c"
SRC_URI[sha256sum] = "79683bf75bff3f897fec2cf2985f62d5ffe8187bb2a2305d00161556a8561f1c"
