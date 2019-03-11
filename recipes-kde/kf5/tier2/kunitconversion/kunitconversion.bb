SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6c62d8fa81a980303b8f9e5881754a43"
SRC_URI[sha256sum] = "848472340fb24fdb57c0ea60bc4bafcb2b3a26d0eede21a2e8b39e730d6bc5cd"
