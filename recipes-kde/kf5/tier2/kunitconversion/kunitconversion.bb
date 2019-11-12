SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "56b729998529c57f6dc6f8d4f1423fa9"
SRC_URI[sha256sum] = "6783d6180b132a80dce2a4cc6c793dae0f5859b0709207c5fc6f4501ef53a822"
