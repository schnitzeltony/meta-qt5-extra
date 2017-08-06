SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c7c4f35dc45abd3603ab654020f2c1d1"
SRC_URI[sha256sum] = "377103eb36855e0bb971fc22c974f85792ee71a73e6705725047ccfe337320f2"
