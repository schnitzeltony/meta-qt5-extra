SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9054b8a05fab2df7490f522a672a9643"
SRC_URI[sha256sum] = "aeb94534470bb581196a3e2eef158694c5b5727a7e9db8ca2d873fdcbf5bc2f9"
