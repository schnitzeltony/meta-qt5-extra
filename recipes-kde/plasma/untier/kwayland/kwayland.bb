SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma cmake-lib

DEPENDS += "wayland wayland-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "eb9f146778e5bc3f238cc7ce8262d73a"
SRC_URI[sha256sum] = "d8ac15243b0f648429e76d925cced8d16d5b001218509395653a5a5d76be3552"
SRC_URI += "file://0001-do-not-perform-runtime-tests.patch"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"



