SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dc0bf58b6239d93e8d65b6a635256fd1"
SRC_URI[sha256sum] = "60f46923127dacaa72a064b853f0da96701a0dd1bfbf9c8f3cd5cac1a33961e0"
