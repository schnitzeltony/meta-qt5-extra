SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qtwayland qtwayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0bd1522139d7952107e674a666f129a1"
SRC_URI[sha256sum] = "62de25d0cf0730389f0809e487024f3c97a9cb0ac187b35767b92c07ca01b801"
