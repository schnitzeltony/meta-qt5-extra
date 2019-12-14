SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4a2e85d3f406f54b8df4083c7ee64c9c"
SRC_URI[sha256sum] = "5ac5f6a687c244709487bc47d7aeca276ad7a925d7618fdf04a7af0e1e3fa581"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
