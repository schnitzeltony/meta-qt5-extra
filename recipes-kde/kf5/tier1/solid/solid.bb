SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "08e4b5b41fef66de9fb82d9e44cdfd4f"
SRC_URI[sha256sum] = "bf3dbf22dc63946cf83cd69882f0d5fb8bf938c90252b85c849ef644caebac8a"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RRECOMMENDS_${PN} += "udisks2"
