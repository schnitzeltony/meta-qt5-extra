SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

SRCREV = "3101528fc7908096333b62af8abce29b303b436c"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
