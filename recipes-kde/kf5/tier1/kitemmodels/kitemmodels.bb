SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "536f945311dc68982ebadd0bf061f3b0"
SRC_URI[sha256sum] = "56f3f518e728a06291e169a6ff2a6c8f5141a04fdad117f8b9f1d0d1ec365b5e"
