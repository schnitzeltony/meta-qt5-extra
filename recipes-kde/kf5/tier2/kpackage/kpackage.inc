SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "852f0cecc9b91a38816bf8e754049886"
SRC_URI[sha256sum] = "c4b924e7c506cb75bdaaf68bd881e79a73999bd6436f29157f56c76f32b48cba"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
