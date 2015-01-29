SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "kcoreaddons ki18n"

SRCREV = "bfe2aef89f88b727a2e5b2d8e9d608a2796bd6f6"

CMAKE_HIDE_ERROR[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

