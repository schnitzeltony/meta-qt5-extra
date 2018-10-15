SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f4d91ba14560148f14e8689f9def01b0"
SRC_URI[sha256sum] = "e2f6d354e90582720c4631432034db2bc86e3b4db2dae4e2622758d33d5fb6b4"
