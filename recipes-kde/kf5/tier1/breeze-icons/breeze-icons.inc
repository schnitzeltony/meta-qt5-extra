SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "7f26815fd35fc6ffa5d9d7a6e21adb2d"
SRC_URI[sha256sum] = "72217c46e071b204a80ff8064b1b7319c7a7f9f0b08e69d8add2065e5d301155"
SRC_URI += "file://0001-Force-build-of-Qt-binary-resource-files.patch"

PV = "${KF5_VERSION}"
