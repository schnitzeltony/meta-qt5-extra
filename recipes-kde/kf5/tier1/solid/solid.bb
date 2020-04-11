SUMMARY = "Hardware integration and detection"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cdbeaeee6f8f0107a501d0bbd8c159a7"
SRC_URI[sha256sum] = "0a033cb7dc0a8040a0e2fa31acfee62251033c98af93a3abe3e45e967a0697b0"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"

RRECOMMENDS_${PN} += "udisks2"
