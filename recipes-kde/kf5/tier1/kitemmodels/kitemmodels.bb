SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5247dfe0a5040021876e5bf854f35401"
SRC_URI[sha256sum] = "602e652803780fe04ad2d3237cb3669c1be06ac3ae5518ca0552d521069f4d26"
