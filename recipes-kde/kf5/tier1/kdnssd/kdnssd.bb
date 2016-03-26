SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ec54202d940f38866b73c550133072a2"
SRC_URI[sha256sum] = "a5a7e1bff06d70f6b78e680d3f966a448b4591e5c0bce3e49bda57fff678dcf7"

CMAKE_ALIGN_SYSROOT[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

