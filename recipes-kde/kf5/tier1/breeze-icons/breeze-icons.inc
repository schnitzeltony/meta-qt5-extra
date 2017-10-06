SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "6f313cbfe1ca5b009ca715cb311f40a8"
SRC_URI[sha256sum] = "89291dd396bd0f42e9b90eb92f46895fa461ebc2b420a58c663e0c4898894e25"

DEPENDS += "libxml2-native"

PV = "${KF5_VERSION}"
