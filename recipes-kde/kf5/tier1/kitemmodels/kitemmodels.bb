SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0aeb304c8e7c9f4a97a913d86fb4c94a"
SRC_URI[sha256sum] = "a67bca5267a2f25d6bb07c10bbb534b480b74479b27ad4f91058f3c94b909dcb"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
