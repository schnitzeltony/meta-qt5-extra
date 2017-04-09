SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "d23d9978a72c4fbffc42322f5c19fa23"
SRC_URI[sha256sum] = "0408c23189acc7d13b15c4b74eebe41924f385ba1604b74906853b007027cb1e"

PV = "${KF5_VERSION}"
