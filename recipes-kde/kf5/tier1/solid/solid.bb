SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2ff51f7f1b907415dac7022327d04b70"
SRC_URI[sha256sum] = "fe36b8d4248bdf88a512add034f650a6dc4769f5190382dfdf734d060fcbce3c"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}/.debug"

RRECOMMENDS_${PN} += "udisks2"
