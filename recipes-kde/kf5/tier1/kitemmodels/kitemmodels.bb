SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "461c5cda7c74ef0b54487c7920b67034"
SRC_URI[sha256sum] = "c09c465e8a2494f4f772ea81dd6398d94074ab3e753101febb93aca5cbd97ce8"
