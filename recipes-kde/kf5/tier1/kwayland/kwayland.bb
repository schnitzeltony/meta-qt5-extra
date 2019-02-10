SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3238b6fe1c25908de1b38452f206b0a8"
SRC_URI[sha256sum] = "f428ca0defd8109d5b101799d3e16ec0c973afa1a930afb31ce0eef7f1083855"
