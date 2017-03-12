SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "52a11c8b01bd4d5cae442ecb37d75b46"
SRC_URI[sha256sum] = "23a3a0b7f25736f1b5169d958de11b9fe2ad1e9e649e08bd283b81f9a19aa1d8"

PV = "${KF5_VERSION}"
