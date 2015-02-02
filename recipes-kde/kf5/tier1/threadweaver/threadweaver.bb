SUMMARY = "High-level multithreading framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

SRCREV = "ce5590c108edde83557eff70232a3cd195eb2d0b"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ThreadWeaver, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ThreadWeaver, -S${includedir}, -S${STAGING_INCDIR}"
