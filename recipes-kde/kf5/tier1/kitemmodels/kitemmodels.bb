SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "931a0d0411ba4f8c0187b63b6d97d140"
SRC_URI[sha256sum] = "4f435db4362832cf63e49896229affd07f125567931fc499751d37ac3bafb149"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
