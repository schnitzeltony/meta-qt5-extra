SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3440e412f70face624c4abcdb341ec7a"
SRC_URI[sha256sum] = "5a37097efb11a4806138ceff056bd845e3e9ea1803a29044af247711679d416d"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${includedir}, -s${_IMPORT_PREFIX}/include"
