SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a4bbe5510e26e04bf328aa173909fa29"
SRC_URI[sha256sum] = "be70e120e5fba91e8bd4c63e75150f063f54195d639b9c28243c760cf46fcff8"

FILES_${PN} += "${datadir}/wallpapers"
