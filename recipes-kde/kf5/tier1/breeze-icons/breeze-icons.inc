SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "cdc55f7a51a0bc67b5edbc739a98c055"
SRC_URI[sha256sum] = "9ba194a2b2a4b2c0702ac39f340dba62772f8fed450b6b5eb6e2d06a33a1c6f5"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
