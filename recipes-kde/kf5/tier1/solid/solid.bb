SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6f8bf09f3b1e226d2ea43b4150476def"
SRC_URI[sha256sum] = "78deab8c55c30f2c923795730a9655b4d05a75cd6240bc0caa64104b141a3a39"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RRECOMMENDS_${PN} += "udisks2"
