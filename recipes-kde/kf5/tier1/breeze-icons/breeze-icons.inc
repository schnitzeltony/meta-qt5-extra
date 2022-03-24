SUMMARY = "Breeze icon theme"
LICENSE = "LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[sha256sum] = "49e09663989fd3498d61cb7518c741c87a702689b6d6074097d628264a064366"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
