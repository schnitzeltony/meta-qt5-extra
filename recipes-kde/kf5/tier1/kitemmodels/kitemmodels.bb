SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b576fef06c996593c64c553244e34ca0"
SRC_URI[sha256sum] = "71fe0a5c2ad9f0f89dfbc2e9ccbc2223b7fa2723166de6f510f8f6d8e469b453"
