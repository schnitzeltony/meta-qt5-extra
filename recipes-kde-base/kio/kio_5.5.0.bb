SUMMARY = "Resource and network access abstraction"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "karchive kbookmarks"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5I18n, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5I18n, -S${includedir}, -S${STAGING_INCDIR}"

SRCREV = "72b971ef5618b41452e709819b217be4ba5a200e"
