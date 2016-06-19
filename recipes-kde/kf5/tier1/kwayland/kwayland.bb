SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8645b010fe6a30c374723cba26266e67"
SRC_URI[sha256sum] = "457da4cee13f4a13b01a06cebe23482105e8222d761f77c20a719fe731c741a5"
SRC_URI += "file://0001-do-not-perform-runtime-tests.patch"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"



