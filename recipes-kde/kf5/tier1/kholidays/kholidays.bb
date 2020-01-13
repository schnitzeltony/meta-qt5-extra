SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "f7bd2bb08ae721dc04836744981176dc"
SRC_URI[sha256sum] = "2d9bb70fbcb3a45208409228b5e5a88b0cb00fe8f2621e2e938bc77c2df11f02"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
