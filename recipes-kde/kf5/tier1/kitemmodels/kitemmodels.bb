SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8cda8cdd9de6ff01f2519c719bc325df"
SRC_URI[sha256sum] = "2d978b4403c2b88f3b1c2795260c4a491d2c6278cf0ac02814afbdb41a787081"
