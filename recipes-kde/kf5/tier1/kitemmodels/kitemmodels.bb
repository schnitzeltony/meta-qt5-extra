SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fb178ef04b48741b3a56a3eb9a464a88"
SRC_URI[sha256sum] = "ecdbf98705cedb7b2a193800106452900520d10ae8cfba2148e45ef1a02efe74"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
