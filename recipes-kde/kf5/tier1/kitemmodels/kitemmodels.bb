SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "958f070cc6d0928dbee067ddca301b59"
SRC_URI[sha256sum] = "47db271ba24904933629ed00f7a4f916a19969967dcfbfd59ae5e98f08f89d68"
