SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "182714e5cffb3f8d98cd9ec9e5e342a2"
SRC_URI[sha256sum] = "7661b91d39a268a4cd95f85be9b88c06fecb7d1a13cbfc1fed101ec9b97982b7"
