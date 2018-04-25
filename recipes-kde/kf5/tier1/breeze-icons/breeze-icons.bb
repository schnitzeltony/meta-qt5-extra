SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "a839fb0d077eea520c5103673a28fb1f"
SRC_URI[sha256sum] = "48ea5e4934782a8ed7acc98861bb83cb659ded5bbc5a6fcd59939e0b3c27f15b"

PV = "${KF5_VERSION}"

DEPENDS += " \
    kiconthemes \
"

FILES_${PN} += "${datadir}/icons"
