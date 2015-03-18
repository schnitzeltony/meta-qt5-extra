SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c5d91b6f92e470feec25b6ba147a44a4"
SRC_URI[sha256sum] = "6f6f36def7f4edc3db47ba9276fd0e8fda6d8310970d0a70f22a38e7bad21a7d"

CMAKE_HIDE_ERROR[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

