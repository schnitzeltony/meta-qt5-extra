SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qtwayland qtwayland-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bfa115b63aab4fe13db1a49ce557ddaf"
SRC_URI[sha256sum] = "369ba54b485214687e719bc9216e3bb50849df3af9a3ec0e95cf5d5687c847c2"
