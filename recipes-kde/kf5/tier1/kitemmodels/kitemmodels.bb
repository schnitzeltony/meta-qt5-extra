SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b83a402d77edce5d472bd8c593b7717"
SRC_URI[sha256sum] = "2fcf1c08766096c9e62fd40087013e7fd69900d8e5d306d392817949e15ea18e"
