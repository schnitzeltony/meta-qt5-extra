SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eb09a60dd4b5753e2aeaa8087efa4bb4"
SRC_URI[sha256sum] = "8f3399ada26dbcd420ab58dda9bfc0bb092279430f2444b07111f3a6f34b3d93"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
