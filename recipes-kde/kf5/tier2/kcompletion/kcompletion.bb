SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "52143b17340fb5e79904f8a4e203b383"
SRC_URI[sha256sum] = "0b4b523d259e253882a01ed9897764097b440bbd242137532af9fc5420705b39"
