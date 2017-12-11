SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "870fbc616eeddace047a97cc49709826"
SRC_URI[sha256sum] = "3ca34472c5575770710f13bffd869ac4cc68d78f50a85cd17086a7850aa7c6ce"
