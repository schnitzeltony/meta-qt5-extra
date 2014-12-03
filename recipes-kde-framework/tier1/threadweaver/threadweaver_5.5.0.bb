SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRCREV = "c380fe7121b4b4695f116ff8139fb5ab58c2bd1b"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
