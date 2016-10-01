SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "07635da514cfc3b4360b947717090725"
SRC_URI[sha256sum] = "69242ffddd77e19618ee19d332210fb8e98e85cd743012001b2a6b1c267042b1"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${includedir}, -s${_IMPORT_PREFIX}/include"
