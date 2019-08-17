SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5ec7713d7b7d2360903014e628b596bd"
SRC_URI[sha256sum] = "e5ffa3ff954c46b2416823467fcecd37c6ddb8304529703bc9cc3a24b74b6c24"
