SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "47c60112e4ee3c923a63a2d20e4f4be8"
SRC_URI[sha256sum] = "dbbdcf05ad00d14931cce83fba968146f46d17053ccd22297a20e2fee9ef2548"
