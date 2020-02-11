SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "588eba3b0ff5768e5aeda6dd0dcdfc29"
SRC_URI[sha256sum] = "aefdd85a83a6803b33793f46ca74c3e8048b2cc3f8c7d7c5b5f4e9fa370d6b08"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
