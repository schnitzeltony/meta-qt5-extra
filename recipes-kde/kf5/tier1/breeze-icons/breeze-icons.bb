SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "a01f8f8bc2bba99fb144b4f5a6fe6794"
SRC_URI[sha256sum] = "f4f8698bd01933e80d95dd9e6dab748ea889ecf34e12454d0847b300204a4698"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
