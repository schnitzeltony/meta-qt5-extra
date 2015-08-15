SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "aa6c92111aec32bf7428356bfbebda18"
SRC_URI[sha256sum] = "d9b8cc9f4cb89350352d18e95c928b8263dffbc705c98006cdc1138c39454ac9"

CMAKE_ALIGN_SYSROOT[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

