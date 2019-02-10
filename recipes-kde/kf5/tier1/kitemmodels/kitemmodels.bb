SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "045f5c3b771e03c4d7d3ed8a61cce555"
SRC_URI[sha256sum] = "862f2b2888a563ff9f61bd25e59b637ca16c8531679cec7f3ad1653cb74ac08c"
