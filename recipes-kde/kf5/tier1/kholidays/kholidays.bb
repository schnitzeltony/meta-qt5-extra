SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "869b536116d3e2c0028aee13a68043e5"
SRC_URI[sha256sum] = "8067d6826564c09c9b2fdd7c8494cd7aeac3f7c9725950bced3d449de29e2fc7"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
