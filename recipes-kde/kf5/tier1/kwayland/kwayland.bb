SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "26384672c03d44b2179f92103da99787"
SRC_URI[sha256sum] = "d86154335a51b4e0cbd190427b7bf5c47c6e85dbb8ca0d7c947f5b191d6cdba2"
