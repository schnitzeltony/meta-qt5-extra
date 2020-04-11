SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "f89f39c2246dfafa647b933a5ba23643"
SRC_URI[sha256sum] = "9f1a5c26dab6c59e6982108d29a155fc06c4542d443d989456bc2c830df00358"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
