SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "34e5ac7a49bdd8b0370ccfc0a5f2c8ce"
SRC_URI[sha256sum] = "f663a21cb6a6a7b7ce08d73454e9c034a51bf9081b931549c642d6d53c0e42d5"
