SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cddda5df856b84d82289056e2521e0f5"
SRC_URI[sha256sum] = "41deff40eb17b3f667fd03f4a30dcf734ca060ebd7e2320eb38ff36ed6a9ce90"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
