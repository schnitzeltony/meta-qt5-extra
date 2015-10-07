SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma cmake-lib

DEPENDS += "wayland wayland-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c0c0eef0f2bfb93a81e4e701d7557eb9"
SRC_URI[sha256sum] = "97ebaec8c02923f645a72ffa88a9e4e50c80b2830af0d7bf741d82defef112c1"
SRC_URI += "file://0001-do-not-perform-runtime-tests.patch"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"



