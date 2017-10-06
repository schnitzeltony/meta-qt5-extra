SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e42f53f01ca5621565993457a6454a7b"
SRC_URI[sha256sum] = "4cfa7661b6d3c1e242b92c9200383400398af1db341dbbd2de573429898d4068"
