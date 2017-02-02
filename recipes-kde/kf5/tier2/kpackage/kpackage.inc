SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6885abaf922b7848e8cda894c3d12561"
SRC_URI[sha256sum] = "ca3eb1f8ffbe14e0ed99cc1aaa2d2ef2c77dfa1b4817ea9ac6fc185e94e53bc8"
