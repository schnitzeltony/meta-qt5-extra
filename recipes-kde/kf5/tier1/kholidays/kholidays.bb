SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "8abfaeee4518335b2c9881f77004263f"
SRC_URI[sha256sum] = "28bc4a987adac5313dcc03b50eb34d910b93f76f54c0aaa0d30b97a086a6a252"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
