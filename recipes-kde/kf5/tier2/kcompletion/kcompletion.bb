SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2bb76268d67db943a6f9385ab4e4251e"
SRC_URI[sha256sum] = "02070a926d252ca8a29970764a39cf984e80e72a4260fe8086718e96c43c0e14"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
