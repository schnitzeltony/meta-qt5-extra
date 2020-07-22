SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "adb8247e92f7b72f3cbc5886cfefe3f9"
SRC_URI[sha256sum] = "4660283d83488f8866dd46de9a9f0729db243b915a20ca8e5b04012928e250f7"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
