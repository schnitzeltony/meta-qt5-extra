SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "059c3b6e24c30655ccf2bd91ef7af733"
SRC_URI[sha256sum] = "e0e64e7e88c8df96f894de20aff4d12925e0d362c5134df83473ea48c0432783"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
