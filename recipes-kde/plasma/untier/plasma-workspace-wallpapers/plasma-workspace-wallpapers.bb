SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e9052ec5323bfa3f2aea7634cfeece3f4ac61f9865cbb401ffb47e3441a84a01"

FILES:${PN} += "${datadir}/wallpapers"
