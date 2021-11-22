SUMMARY = "Breeze icon theme"
LICENSE = "LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[sha256sum] = "99659ef3775a537fa51b0a9e942bbe1b7a5a6f9d911adf2ca2d3e9638f0884b4"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
