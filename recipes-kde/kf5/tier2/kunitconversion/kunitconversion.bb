SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ff5c4c6e5ac86257522876644b572c30"
SRC_URI[sha256sum] = "f0ae5d328063e0ea5e93ad61c7d925bb17a3b761040dafe76eea4a468be15fff"
