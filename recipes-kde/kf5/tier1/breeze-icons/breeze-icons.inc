SUMMARY = "Breeze icon theme"
LICENSE = "LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[sha256sum] = "d0211f0e6fa9137dbb42bcad1ac352bbfe793b6a3e6483adc2051b5c24a7851b"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
