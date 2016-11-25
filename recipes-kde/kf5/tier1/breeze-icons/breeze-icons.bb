SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "6087ef0e0e6612a1ca978c4ba924a4f4"
SRC_URI[sha256sum] = "02fa95a016cf8ae72a8ea7003fa480194d1d347245f7a7bb61ea94009e78fc1b"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
