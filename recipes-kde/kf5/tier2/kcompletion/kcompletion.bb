SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "51cfb4f5aafea5e85fb962da96e7eac3"
SRC_URI[sha256sum] = "224761954421b2e25c2b9651c7e730da9fb7a569674c399c867a9f895d3ad523"
