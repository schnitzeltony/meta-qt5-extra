SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "9db3c27c991006fef65b3a5ec82c2ba6"
SRC_URI[sha256sum] = "830c738605a4bc461d655fd3e0f66ec06a25cdf136910bc6a83f304c199007eb"

PV = "${KF5_VERSION}"

DEPENDS += " \
    kiconthemes \
"

FILES_${PN} += "${datadir}/icons"
