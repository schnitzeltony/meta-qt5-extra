SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "6f7e0a3d91a18fc31c7b4683f1174358"
SRC_URI[sha256sum] = "e274c7f5c71c177e2e9d8ced9c49cd052ec2f726cb693c7df73e96af12277e8f"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
