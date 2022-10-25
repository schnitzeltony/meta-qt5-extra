SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e24dcdfd61e09b1b2df84e5db9f5326db73971683c12a0303d759c59de608ad0"

FILES:${PN} += "${datadir}/wallpapers"
