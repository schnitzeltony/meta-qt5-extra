SUMMARY = "Breeze icon theme"
LICENSE = "LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "7b7c232cca879776412e4a5879080ef281d971fe2bb03d9c08ae638e357061b9"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
