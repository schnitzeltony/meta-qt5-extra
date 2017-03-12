SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "890f0b6295c26bd185dd9b96b7dd13db"
SRC_URI[sha256sum] = "9ccce2d638445763a961542bff5dd666417485ac8b96bb9c32644b062f11400d"
