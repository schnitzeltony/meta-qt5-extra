SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "f16a9b1a901700ecd0790e3d80ae32d4"
SRC_URI[sha256sum] = "85a00cf7c245b8e1b2f782a8b194a59ea198e6385e06c446999e6759c4d48afa"

PV = "${KF5_VERSION}"
