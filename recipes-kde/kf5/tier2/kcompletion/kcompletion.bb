SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c97543ad15f56a355640abd3535974ce"
SRC_URI[sha256sum] = "fefea3d162709d06ad7a3148c1e7faef20525cd929360687e91289c891f24fde"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
