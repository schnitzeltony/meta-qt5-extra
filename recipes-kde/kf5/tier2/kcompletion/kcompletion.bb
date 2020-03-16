SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "591467698e80e0e09f111674196e4b3b"
SRC_URI[sha256sum] = "642d68b4c472e11a8861a61238297633be288bfd72c13547707754f1ae2be33a"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
