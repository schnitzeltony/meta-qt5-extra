SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "ki18n"

SRCREV = "c4633273904b5993e29f224e4d66e279764f0c79"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
