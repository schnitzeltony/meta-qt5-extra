SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "wayland wayland-native wayland-protocols"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2ff87b5ba7007b3d14209c470de15807"
SRC_URI[sha256sum] = "7c99bfac8f4bff457a5384c846be776c385649ced76be0f48699c6e12de24e7c"
