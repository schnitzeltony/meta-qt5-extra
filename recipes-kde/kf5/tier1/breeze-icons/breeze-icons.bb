SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "e717dcb76e5dd8d7b7145d76db4f2b30"
SRC_URI[sha256sum] = "3eda58a4c7c9369fe9b246500d88a964d3411f83e1113727ed723989d935dea7"

PV = "${KF5_VERSION}"

DEPENDS += " \
    kiconthemes \
"

FILES_${PN} += "${datadir}/icons"
