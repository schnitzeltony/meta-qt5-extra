SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "47cc7f51a7cfa0ef3c193ccbcc045f96"
SRC_URI[sha256sum] = "553378be1e5a4460b8c15b57511c99df85fbf06c351c88a3fb792bb7a8039d6c"
