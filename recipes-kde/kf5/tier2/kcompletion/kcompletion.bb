SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "56559cc6ff7db07896625edcdc8a175a"
SRC_URI[sha256sum] = "aa6c1c53e225625ef72265a4339d3a076193fe2cf01178d4a862df6bc4073207"
