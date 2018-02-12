SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5146a71a41c76385cf34544c67005d84"
SRC_URI[sha256sum] = "0d437d1b08a87e84b2a24bacc9adf2d7b9f3d259b503727454aa2ebf13735e93"
