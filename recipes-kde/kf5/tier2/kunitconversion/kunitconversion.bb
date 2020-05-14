SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3465dcb86a7d5247b2fc6504dc59f345"
SRC_URI[sha256sum] = "d63e7646a8059fb333f95b27548044e897b38ed5c939db416c0c1077bf7be46a"
