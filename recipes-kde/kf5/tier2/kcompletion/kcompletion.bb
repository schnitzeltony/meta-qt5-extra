SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8a585781c675f3da27fed9538b388c12"
SRC_URI[sha256sum] = "bf0b6ce1ee133900f169662dbd35da6f766d3e4e02c0c102a9402e20450a22a4"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
