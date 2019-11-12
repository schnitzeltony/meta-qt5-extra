SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native wayland-protocols"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a6015cc5f0ebc88926e5de857c53572f"
SRC_URI[sha256sum] = "1540d4ff62afd0bff234e08618fc77d2c54b5cd69bf9c478c45a08a6e69349d3"
