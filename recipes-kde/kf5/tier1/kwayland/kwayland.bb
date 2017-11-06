SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb059fa1d8b288fb3be9a5fe4b747232"
SRC_URI[sha256sum] = "dd74c8edef9f28dd8f2df9e52a7f32f844d16c342e3184a69a57eb6c0f893029"
