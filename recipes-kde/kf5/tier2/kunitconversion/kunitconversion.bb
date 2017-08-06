SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bd4531f7f14a08a77be539d3b497dc82"
SRC_URI[sha256sum] = "b0b285f610d402f78a671cd538f50b20d7c6ea7d7b6f583bcdd4c411e0b042f5"
