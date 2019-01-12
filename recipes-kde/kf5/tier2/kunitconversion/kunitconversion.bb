SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f7ab815ff57651fb0db5f632634b5da8"
SRC_URI[sha256sum] = "10d165fff9b8b655793326dbb3eccbd779349b39ed66ac44aa8e462a6df3b953"
