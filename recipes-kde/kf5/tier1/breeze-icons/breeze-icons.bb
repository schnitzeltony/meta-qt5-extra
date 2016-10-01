SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "b3a784fe7be04be0e1bf79573fc7a1be"
SRC_URI[sha256sum] = "a9c0d742a37ef3b3b2dae5a5bb97aee2927dd613c17c606f3bcbc6845a8c6bcd"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
