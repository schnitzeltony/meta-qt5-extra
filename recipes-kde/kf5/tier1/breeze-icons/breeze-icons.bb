SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "661007c24d36a074220a41e365141aae"
SRC_URI[sha256sum] = "a2b344907aab4e0549d72740f4ebde0e60566ae5240d63f7584da7d4655c07b6"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
