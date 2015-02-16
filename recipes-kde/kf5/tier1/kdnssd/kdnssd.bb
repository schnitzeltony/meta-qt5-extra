SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fb40f8bef645c65cc6680d9c714eecf2"
SRC_URI[sha256sum] = "be8d50b670603366e87b577b62f2c56e505c974c360f8c7ef9d23a8130651988"

CMAKE_HIDE_ERROR[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

