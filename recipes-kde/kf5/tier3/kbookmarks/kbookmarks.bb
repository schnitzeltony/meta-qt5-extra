SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7425331df90a2a4b4d4ef9b56d0e655c"
SRC_URI[sha256sum] = "752319c2012efd00ae9efa5622e802a852cec926dc385f4c02f0088dac0762d1"
