SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "wayland wayland-native wayland-protocols"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8a9bbb74a205206d4b98f617707664b5"
SRC_URI[sha256sum] = "f43231f10a5294f7ac3d43d2b903f1cf9649364782ca55831e0c069a54cc170d"
