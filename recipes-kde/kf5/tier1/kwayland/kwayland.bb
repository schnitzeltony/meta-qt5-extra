SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "aa8641ff6d62c77ee68c4d91622edd09"
SRC_URI[sha256sum] = "78e2902520a3d3b13f8db3c5b5ee253c138cfe07934ac3fdd7a3bd87a020625e"
