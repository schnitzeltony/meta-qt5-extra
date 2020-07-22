SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b0d7e2e3b2989d1065311b909768fa24"
SRC_URI[sha256sum] = "419d415191cfecba074b2160b292c670de17ba1dd88ab031f8ced56dc6cbb827"
