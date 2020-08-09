SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "72b0650e5ae9f30ad4ec30b55e660c826d93edfda0ef4f9436f226cbb8a9705a"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
