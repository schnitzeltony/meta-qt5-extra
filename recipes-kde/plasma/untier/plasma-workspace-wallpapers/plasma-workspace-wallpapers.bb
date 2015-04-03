SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8c70b41f3310aabdf719d3438498a26e"
SRC_URI[sha256sum] = "97d66cce48114ff4ba2da8cc90aff4df0cd60ff51c615f357665be4a160b5c96"

FILES_${PN} += "${datadir}/wallpapers"
