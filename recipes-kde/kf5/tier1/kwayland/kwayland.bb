SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths

DEPENDS += "wayland wayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5b65f9c90e19330d09aa58323d758e2d"
SRC_URI[sha256sum] = "39ae3b71b452e555ef2715a0b1305d44e52b1913882981f8e2e036f481f3e580"
