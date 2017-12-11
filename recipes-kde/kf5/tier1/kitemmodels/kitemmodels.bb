SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c16c33b4e37dd61a1b6102e4dfa4084c"
SRC_URI[sha256sum] = "b39487f5e1f004ce42f021bc9108b717f99a08875c662dc15dd0ba88247b768e"
