SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a8a902d7a73c4d5d7d72e25838b2e593"
SRC_URI[sha256sum] = "9179d31509918a8ebbc42927b5965510d6ce4995783585450082e2af62ab8269"
