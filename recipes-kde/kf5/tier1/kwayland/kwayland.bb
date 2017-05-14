SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3e70566a1e059a7885270074e46b35f0"
SRC_URI[sha256sum] = "2b82b53c5839644283a9ec4eaa2d9431b6ccd4f69f0188668c6b1f52554eabff"
