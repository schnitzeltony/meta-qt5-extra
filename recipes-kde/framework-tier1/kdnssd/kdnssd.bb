SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "avahi"

SRCREV = "980e5035baf769894da000d8db8867e47224dbec"

CMAKE_HIDE_ERROR[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

