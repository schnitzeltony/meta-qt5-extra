SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "122852758f493b7fc299d9f3bec99184"
SRC_URI[sha256sum] = "588e6f7b0c066993dbd9b6a0fd2535cd2f1c58ea5bd7ebe1dc381049776bbf62"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
