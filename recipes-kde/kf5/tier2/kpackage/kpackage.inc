SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a8bf815c1189b23d142f8535708e2317"
SRC_URI[sha256sum] = "3997add0d4b4fc7a6f9fa86a2dbec2e4f419c8b2e1e2c02fce6d2f6839466814"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
