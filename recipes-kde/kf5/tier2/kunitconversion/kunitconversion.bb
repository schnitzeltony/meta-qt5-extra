SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f65c60b2adb60277181178ef0a591188"
SRC_URI[sha256sum] = "7906c5d3e911b6689e6aa55a5d63549658069696f2c4f89f317c3cc3862e952a"
