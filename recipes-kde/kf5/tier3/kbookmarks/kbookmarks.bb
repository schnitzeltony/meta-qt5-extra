SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ebdfa33e711f88b59a38a988a120b1e4"
SRC_URI[sha256sum] = "c564d03ec770696bae46130668fef494f91c75654ddf7cac20f6dfdf81bedbd1"
