SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

SRCREV = "124723a60eb6eabbb081255ef13cd71285ff5faa"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
