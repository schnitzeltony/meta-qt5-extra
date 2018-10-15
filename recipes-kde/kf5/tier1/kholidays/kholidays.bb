SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "c87f56a92c4f97dc0f6aeb75708b87ee"
SRC_URI[sha256sum] = "ba2c901dccc1c23cfadfd6cb05843ae47ffa5bc9f0cc432e61dccbb1e699755a"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
