SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qtwayland qtwayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "733db6aca706abb750879fc8cb0ac70d"
SRC_URI[sha256sum] = "977d599f8f83ee5f6d6789bcddc21648238fb429e8b25cbebee79562ff084c85"
