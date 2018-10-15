SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "61f92b2865232980031dc1c9d6d20820"
SRC_URI[sha256sum] = "6e839e02169e505b8030f26977cf7146d2a03167ead98485beb5d42fd71ab009"
