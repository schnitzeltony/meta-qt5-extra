SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qtwayland qtwayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a5bd12d4f453e7fa2873887f8b67ed24"
SRC_URI[sha256sum] = "3e9b424cf41799ddfe3f22e89c01b2e702e75cc0c6f4829377f6ca1ebf5b3743"
