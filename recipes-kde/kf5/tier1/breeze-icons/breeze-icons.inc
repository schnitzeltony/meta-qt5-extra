SUMMARY = "Breeze icon theme"
LICENSE = "LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "96ad021edd6999e632991bff286f13601b898dc623388e52e82b68b5ac0a0f82"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
