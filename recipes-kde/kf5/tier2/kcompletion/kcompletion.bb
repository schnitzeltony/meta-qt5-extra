SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f33439a380b21163c1f04c780f7c820a"
SRC_URI[sha256sum] = "5ad8746a57cef2b12da5a97e296cbb0b708e8ecfb4253786a899fa86951395ec"
