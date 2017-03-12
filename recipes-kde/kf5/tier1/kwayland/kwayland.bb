SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "af4831d4a705cc8fbb5b4c227cefb6b3"
SRC_URI[sha256sum] = "adc011e3cec25aeb920b55d45f81e5866a7a46d3a5979376735980d0f1c1fbcf"
