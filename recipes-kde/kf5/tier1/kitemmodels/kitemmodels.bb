SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5ac5d11f5edc55d11b4ed81ead58a9bf"
SRC_URI[sha256sum] = "364799922efa153d5bd6c326a8c3311d7170356807be1e67eb4d5135ec62f5ff"
