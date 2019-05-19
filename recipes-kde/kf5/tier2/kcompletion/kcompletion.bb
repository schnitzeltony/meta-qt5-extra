SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "920cf624a739e63290743f5c3fa418f1"
SRC_URI[sha256sum] = "4f5be9d3a70183e0580126c6395d34e3e4141d6e6f852f5f0bb578b20205f5dd"
