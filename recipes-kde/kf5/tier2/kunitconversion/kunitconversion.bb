SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "29f480e07ac174bd7be4ed444143a953"
SRC_URI[sha256sum] = "8605975eb05031e3e2d0295ca577c3010c45b00cd9daec2cf9c1861998bd9629"
