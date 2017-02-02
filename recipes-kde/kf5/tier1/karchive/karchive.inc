SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d25e41851ea5da7e589a1c7ec530255c"
SRC_URI[sha256sum] = "18b35d437e7cbf6f00983d0f66372cbd6a0daedaa58e6c092838c20845571f38"
