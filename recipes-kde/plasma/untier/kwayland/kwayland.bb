SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma cmake-lib

DEPENDS += "wayland wayland-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a8a0e4cd6215b1f180bec562c29c7841"
SRC_URI[sha256sum] = "ee5cd14c034d34a4cad902e0aa34776d3421da8c90289239e0ac7d5748ef2690"
SRC_URI += "file://0001-do-not-perform-runtime-tests.patch"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"



