SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0696b8bfb31d5541a28beb9ea7aeed6b"
SRC_URI[sha256sum] = "c27f0ca38d4b6593115fbf257423c6b1ffa35cb2d7f341fc4bf3e43262b90f03"
