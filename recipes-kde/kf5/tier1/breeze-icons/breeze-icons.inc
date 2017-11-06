SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "af475588c5f263980d9c92f3b1c7b733"
SRC_URI[sha256sum] = "bd4077f88d106f7dcdefd8f260edbee597e72572e17f443ccd10d3a0eabb4b8c"

DEPENDS += "libxml2-native"

PV = "${KF5_VERSION}"
