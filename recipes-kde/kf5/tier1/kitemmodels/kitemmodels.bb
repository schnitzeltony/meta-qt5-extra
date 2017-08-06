SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "48e3bbe0411277c8b020331045b82133"
SRC_URI[sha256sum] = "2a05bc2f807b725de0515dbc12f031b00026e97d0901a8d05f475ad9b2926b23"
