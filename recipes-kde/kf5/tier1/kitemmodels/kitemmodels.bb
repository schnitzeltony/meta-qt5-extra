SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3d231905df98575590325054757b1113"
SRC_URI[sha256sum] = "83779f373340bf474017f8b8c654190ef03d275c99ceb04bfd13fa3d614842eb"
