SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9c268db88630f1d62b5da51131c81a60"
SRC_URI[sha256sum] = "b0eef30ce3e5f2fe9afb60d589bea16a0d0e4a57ffffb37ae0e14a54f1681464"
