SUMMARY = "Breeze icon theme"
LICENSE = "LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[sha256sum] = "4367dfa6b48aa645a3680489be96e03a9a6fc20f57277b3ca5e37ce8df4d03e6"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
