SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "78b4d77f4b183f0db4111ed176d7a416"
SRC_URI[sha256sum] = "efa5fe1ac1bd8716c9bc0c952709b63f2052daae528f15156a8d6c9e6fc5cd16"

PV = "${KF5_VERSION}"

DEPENDS += " \
    kiconthemes \
"

FILES_${PN} += "${datadir}/icons"
