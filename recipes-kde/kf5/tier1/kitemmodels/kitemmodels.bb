SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "156f7a7223100264c8fd23ab2bf65432"
SRC_URI[sha256sum] = "5c8bcc36b9c29868ba7fa1ece9b83385379d7fed04937a92454ac94a356b3854"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
