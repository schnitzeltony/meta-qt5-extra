SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d89c65ea022e193de5bec88e17622073"
SRC_URI[sha256sum] = "02734480c9893f02fe3d277267909a28d52648a5dac173c9987d5aac165ec877"
