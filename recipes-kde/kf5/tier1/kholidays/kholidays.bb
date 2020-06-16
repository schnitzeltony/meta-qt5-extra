SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "556cf8450d209b7ccdbade72eb6fd086"
SRC_URI[sha256sum] = "5469718d6ede7edb2ab06bbaff8af01567ba77ffe2160c2c2d47c666cfebf417"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
