SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "643ab111eabcca08e964062ee8c53041"
SRC_URI[sha256sum] = "699a1e7e1c78159efb501afc197f9b9959a800405da1ed9de9115ea13c98c0ae"
