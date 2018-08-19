SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4412ab5a5446aab1df6f7bb59bac4365"
SRC_URI[sha256sum] = "4f368c88ad9254662c9ef0765394e659ac54c9003cf65c0bd1129012c05030bb"
