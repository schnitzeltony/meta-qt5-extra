SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fe7cc3752119d393911c57b0043161fb"
SRC_URI[sha256sum] = "01980a8b518cdb442ace10f7a61dacec1cb61ff708d86edf83ee079cb6451d41"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
