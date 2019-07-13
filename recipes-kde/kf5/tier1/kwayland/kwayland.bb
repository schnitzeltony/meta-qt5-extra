SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ebd69263c6d65ef59b3a70b7ae2bbae8"
SRC_URI[sha256sum] = "a0645594c2dc7c121b11eecf1c1d31448d110d13dab200caadddb7e1d836d905"
