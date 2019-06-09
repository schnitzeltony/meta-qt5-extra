SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7299de4c84152a3cc9a98e4b444f4291"
SRC_URI[sha256sum] = "1d5493661c34043f29a39a4a05d7e0509572ef5d0e894980b54eed6efcab1045"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RRECOMMENDS_${PN} += "udisks2"
