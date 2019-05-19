SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7d1a541f0e3ecb0e31a1e02bf14ec043"
SRC_URI[sha256sum] = "f861844a6d24ecdddd7b2b29d47dc03bccbd5dc2c8053f5c3a839a5ff59cd491"
