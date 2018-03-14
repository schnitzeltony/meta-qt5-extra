SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4f45a38c826de4d85abb35cc141d44a9"
SRC_URI[sha256sum] = "48f1f8a75770f909367d9b0a9d3bbf2d8847a0fa519da6a532e8be6d4188c354"
