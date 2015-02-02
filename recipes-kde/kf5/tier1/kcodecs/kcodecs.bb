SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Codecs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Codecs, -S${includedir}, -S${STAGING_INCDIR}"

SRCREV = "bfb64b089a5003281576fadaa5530a65f82e35f2"
S = "${WORKDIR}/git"
