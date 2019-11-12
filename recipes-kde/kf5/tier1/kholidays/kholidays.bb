SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "8945bfcb4aa7d17cee36e7a5cfb9d5b8"
SRC_URI[sha256sum] = "65b847ba7a00e1a42c0048fe05a400f584e1d9e746edb5d935331ffcb1f5d4ab"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
