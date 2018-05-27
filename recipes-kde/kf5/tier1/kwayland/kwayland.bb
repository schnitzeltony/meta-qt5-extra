SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1a5dab28ff9e07f13f528200cf3059d6"
SRC_URI[sha256sum] = "d28af10659af8a6970d9a04253d80c29d6098f36cedf85a3a0698ea42eec9bb7"
