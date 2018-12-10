SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f4d5826a20517d81387d20afb558ad0a"
SRC_URI[sha256sum] = "747d2c4f9e78db802971172b31bb342fb4376b68092bad65f2ac99fadc297cbe"
