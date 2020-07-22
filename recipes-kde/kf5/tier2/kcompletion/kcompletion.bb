SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3786bfe2f6b6572a6ebedd4270f53638"
SRC_URI[sha256sum] = "c73259f91c569162d4ff4aa52df9e3c8da9c43a5a2f25daa5b7d0f9c622cb220"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
