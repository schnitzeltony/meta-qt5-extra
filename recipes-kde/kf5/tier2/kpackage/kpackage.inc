SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "121f814f4ad12c56928ce7b857ea87b7"
SRC_URI[sha256sum] = "2d2d497d50e8ce986d6de4462391122963d9b7605889fd20cd3ceb4dd6910814"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
