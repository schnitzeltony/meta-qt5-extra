SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "7610acf496bb0dc43089e1f71388f450"
SRC_URI[sha256sum] = "c39d5bb13f1a3e81ac5cc10f44f842228c7441a98c3c370aa55ca93ffc9566a5"

DEPENDS += "libxml2-native"

PV = "${KF5_VERSION}"
