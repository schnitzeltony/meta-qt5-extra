SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8c53d38b67a0626ecf9d8cef4ce5da4c"
SRC_URI[sha256sum] = "c010352c5858df9ab184c0d8ba0e72278132cabcd2f7d6c0b3b6aa936802ef69"
