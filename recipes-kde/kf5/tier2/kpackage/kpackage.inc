SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "232e476d2d59b789a10c7be3cb6832a0"
SRC_URI[sha256sum] = "8d4dab6fd11b4e565e38590a9d8f98f85b26814eb56808de43ce3db23a976ef5"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
