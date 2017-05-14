SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

SRC_URI[md5sum] = "9d13ea7dcd31efb400e2f5a64db48179"
SRC_URI[sha256sum] = "8acc1560ee349d4858025ac3525abaa5a7edd879e5589173e1337bb3dea3dffe"

PV = "${KF5_VERSION}"
