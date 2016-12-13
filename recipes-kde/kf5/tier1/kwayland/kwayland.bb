SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8d6a9ebd10277d4142292232290af7e0"
SRC_URI[sha256sum] = "e957dcbf32fe2c846ea11d82ece7519b7a513eaa9eb8021befa2c690ded9e957"
