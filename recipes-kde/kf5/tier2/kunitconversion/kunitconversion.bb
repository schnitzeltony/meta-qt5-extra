SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2168ee7da44a9d093df3f6486c0faab8"
SRC_URI[sha256sum] = "45654fd401afbff1fa12330e5ea1b367c8552bc722883414698ff156caa0533a"
