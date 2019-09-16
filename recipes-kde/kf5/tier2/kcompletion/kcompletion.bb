SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e1373d0c5df77d32f2224747f23bc6d6"
SRC_URI[sha256sum] = "af774190ca1a0e4d335485548d6e5c1e02042a5d0e29a3c0db17c24e3656edec"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
