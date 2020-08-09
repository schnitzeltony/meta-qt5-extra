SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "6569e289ac9263d87ef6641fe2f3914b9ace6814832ac9c61825b1c6805ae371"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
