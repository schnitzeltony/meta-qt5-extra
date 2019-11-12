SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "02ac3300212b7426487e583ff0fec836"
SRC_URI[sha256sum] = "c39c80317c75206ec347edf6d301cb66c2117489f37725374fcfe3b1459aaed6"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
