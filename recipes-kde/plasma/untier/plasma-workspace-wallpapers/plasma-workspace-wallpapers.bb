SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "4aeec36035356cca71c0966e9d7dbc7d9fca6be4c27abd990f0fa954a91374f9"

FILES_${PN} += "${datadir}/wallpapers"
