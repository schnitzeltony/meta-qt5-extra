SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "kcoreaddons kwindowsystem"

SRCREV = "7ec5be038c40bee9471b07752b5a0036339d7687"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Crash, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Crash, -S${includedir}, -S${STAGING_INCDIR}"
