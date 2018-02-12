SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b03e7c6c53b0919fc09059a1614b2aa2"
SRC_URI[sha256sum] = "51aa27792577a52d3c09fa5f08e4d057827cd569dc836839f3528eb2ed4a973e"
