SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "962e29ea6311810293dde85133bbc8c1"
SRC_URI[sha256sum] = "4006e9b10b65fbd3e821025a5ee2345b8c0352fb3b9be4d46b8546cb42e6d437"
