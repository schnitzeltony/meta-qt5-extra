SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dfa9a794aea1104bb45e17f229b2da8e"
SRC_URI[sha256sum] = "13a965e6297332a1db72eb0e7d17f40a011d4450f7931d9542dd43b4f553a476"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${includedir}, -s${_IMPORT_PREFIX}/include"
