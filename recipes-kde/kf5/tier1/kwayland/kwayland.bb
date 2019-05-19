SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1f029fbeb30e11fa362fa9a5ef836111"
SRC_URI[sha256sum] = "a273a64ac06698e7c7d297da05c3b4889893c8b4179b01aa7ae1c2fb8681a4f1"
