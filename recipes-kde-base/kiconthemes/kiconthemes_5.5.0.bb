SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

SRCREV = "99cd7bdbd99e809d9de26977c4788d2d90db24cf"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5IconThemes, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5IconThemes, -S${includedir}, -S${STAGING_INCDIR}"
