SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bd8222ad891ed9faaafe1e93f9134461"
SRC_URI[sha256sum] = "36b25551adea2510ed5bcb854fb769cfb7ca97db88e507b9339d39c563462c33"
