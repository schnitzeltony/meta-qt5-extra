SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4b7ab34387c480efea88daffd6461243"
SRC_URI[sha256sum] = "ad617dc843297c2c4d5db97ea528c44c886d52c89125a77f9494da09de8187fb"
