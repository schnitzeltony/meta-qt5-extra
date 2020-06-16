SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9c44cc7565df5df045429258a4906c6b"
SRC_URI[sha256sum] = "68205f09d63a916f236e2b3b729c0055377d852de48f7cf29fa7174ca97b84e7"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
