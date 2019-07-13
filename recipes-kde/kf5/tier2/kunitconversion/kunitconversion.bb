SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c866421ae6caa2de41ba862d5a30b577"
SRC_URI[sha256sum] = "0e377f67b6977787861aba971167aedfaa0e4c023609d505ea2d57357c082a79"
