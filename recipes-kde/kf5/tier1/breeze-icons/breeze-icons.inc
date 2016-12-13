SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "799c237be7c59ee0a452cea034565f43"
SRC_URI[sha256sum] = "0bad6cad78f948fd73fc89ae2566b59b6859a752e95eb348ce735408d4bffbae"

PV = "${KF5_VERSION}"
