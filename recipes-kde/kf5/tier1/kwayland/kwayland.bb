SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3634281366afa7e86d1c570ea04ab467"
SRC_URI[sha256sum] = "a2c473c7f5cefc87b5b63813fa1373c43c1c8374423fb85fe1c187b553453341"
