SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native wayland-protocols"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6bca459a354e62babaf78e37c900dfd2"
SRC_URI[sha256sum] = "75b22e59dd6d3d70ce7a46b8d431050e2f00f6094ae25e969af90ae535037b12"
