SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "8cb824a9748eff79430aa285d10f9ab6"
SRC_URI[sha256sum] = "d38d8c9b95eaac75d9310cd3aca617be791e93b4a7372d8d059d918fe9bf82f7"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
