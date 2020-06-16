SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6167f8aaf17bb09e9b9b029cd56291b0"
SRC_URI[sha256sum] = "72a7bdd8306ec4cda5f504819e0ff3f8baca6530fa04e33f10b6b89dc010505b"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RRECOMMENDS_${PN} += "udisks2"
