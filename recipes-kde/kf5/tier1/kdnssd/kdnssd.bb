SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dee90b037ebdb1b30ad9711efaa48037"
SRC_URI[sha256sum] = "83ede535d2d01dae9dea489fe2cbd1517b4e3508fef96cadf8bb9c7df8ee41b7"

CMAKE_ALIGN_SYSROOT[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

