SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "ki18n"

SRCREV = "276398a036d336542de90b3f4457ebb3066f8364"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
