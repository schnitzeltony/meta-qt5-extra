SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "319f7b14242a54445da1df6c6938fb3d"
SRC_URI[sha256sum] = "18d951c2ae16cfe2765dfec3ff42ce88f4b716b242294690efe8ff727395406d"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
