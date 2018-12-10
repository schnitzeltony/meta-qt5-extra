SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "89e6c4d46895f827fc36cab1b3782bf1"
SRC_URI[sha256sum] = "dbf01ad2fa50514ce41fc88929bc5b81a11e1a2401b9744f167b2e85996b26fb"
