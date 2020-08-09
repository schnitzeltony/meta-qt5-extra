SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += " \
    qtwayland-native \
    qtwayland \
    plasma-wayland-protocols \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "ee34a490a7bbc5e83eb36a6ac70492a76cb054d3077d0a8db216fd8b07f27bfe"
