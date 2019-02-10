SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4476d603af984cb6322a9f831a906c41"
SRC_URI[sha256sum] = "1830eb3b068f928b21d76b5c6117ba9b871074a6f1e68d830bdc9c5d6677acec"
