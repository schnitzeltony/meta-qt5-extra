SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui"

SRCREV = "ccbd27549aad8a5efefe2c0b0e1473238451b471"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5I18n, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5I18n, -S${includedir}, -S${STAGING_INCDIR}"
