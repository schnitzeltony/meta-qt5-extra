SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f164c19c9316bfbbb51e83aa0c567c26"
SRC_URI[sha256sum] = "81cf879c8ca546bb1626c3c3fcd82d365f0d5ee45aba5066be8b3b468ddeab22"
