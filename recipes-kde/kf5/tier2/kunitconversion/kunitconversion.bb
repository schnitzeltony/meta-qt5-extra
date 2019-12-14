SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9f517dd41f8f224db372aefd0e96c108"
SRC_URI[sha256sum] = "aa751f4b5d9648656120e9e99b0e28560e468daa01156c85865fbfca42de683d"
