SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "97ba639374122d2ae0fa8bb3cc43b85a"
SRC_URI[sha256sum] = "bbe76d398b96e0f0ba4342616b91de49e7cbc1f0a7f5038cd97a981f8a8de99c"
