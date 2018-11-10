SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d6ae3e7ef1cb101387d9c5c43116d051"
SRC_URI[sha256sum] = "36a05251365616cfff4fc2ee94ab78fcd78dd1426e88c26c321532fe7c126df9"
