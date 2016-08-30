SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "73827857016fb3444101929fbd9fcd83"
SRC_URI[sha256sum] = "0190db136a1d2c8d6065aa3e01fc64a9753c1f7a6a6fd43c3250ea9831097137"
