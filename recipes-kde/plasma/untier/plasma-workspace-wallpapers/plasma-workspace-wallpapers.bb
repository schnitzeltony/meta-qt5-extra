SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6520d5da0fc7eead05e1a1ef5be4adf6"
SRC_URI[sha256sum] = "60f5dfd7a6c9cf4faa07182fbfd9e07742ae7ed4183afa464e16166b039172c6"

FILES_${PN} += "${datadir}/wallpapers"
