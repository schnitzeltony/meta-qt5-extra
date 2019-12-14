SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b87704fef4981d01796c5159d30c77d9"
SRC_URI[sha256sum] = "bdd7201940fa47ac1b62f6fcf7a12883abed44876ff729cb430c11d3868eb8ae"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
