SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native wayland-protocols"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e4732f16ecda5dd168c79e8f10391ff4"
SRC_URI[sha256sum] = "afcd39152c364a44c85c78e56bcaa5bb70c0a221ecfae3811b14e60a7884e80f"
