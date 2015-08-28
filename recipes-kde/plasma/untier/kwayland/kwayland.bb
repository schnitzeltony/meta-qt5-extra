SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma cmake-lib

DEPENDS += "wayland wayland-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "720809300dc4426034686f0069680599"
SRC_URI[sha256sum] = "7730e8f2bc77172a89987c4ec59de6e8bb454cb1524beac53a9b19ee7f09447b"
SRC_URI += "file://0001-do-not-perform-runtime-tests.patch"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"



