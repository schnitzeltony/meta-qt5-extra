SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "60c2eb4b4bc7227213bc1b570be75cfd"
SRC_URI[sha256sum] = "612be6a9c1e2b32b8facad1b1748c2a09f89a0d92b9cddaad1805d627f538031"

CMAKE_ALIGN_SYSROOT[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

