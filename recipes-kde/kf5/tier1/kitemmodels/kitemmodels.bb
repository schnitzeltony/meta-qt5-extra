SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2002f6174604292eaf9e8fdb978c59cd"
SRC_URI[sha256sum] = "7a0a76e5253389c1ed459249a05e463fed140b1adf20db1416da167d5c56a104"
