SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "a38adc12cbc1f3c9bc4c1a1f9de73ad3"
SRC_URI[sha256sum] = "4e0898bbe5f70053282eb954c0bd5b9f6fca9c8c228bf70adf39fc91704972ae"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
