SUMMARY = "Qt 5 addon providing access to numerous types of archives"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bzip2 xz zlib"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "edf96ce52f1330c28c1c0e0251d4fdb8"
SRC_URI[sha256sum] = "3fa1fd34e6a9f90b00dc877e7e8bc0fe033ff6ad8693e78e9cee1c9e9f01b0b2"
