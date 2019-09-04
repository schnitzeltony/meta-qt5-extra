SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "86e6cc11c250989db93b28fbb60e26e6"
SRC_URI[sha256sum] = "ff6e0eac42c540c72556439e6477fb78be2dab456386218813cce021f82d42d9"

FILES_${PN} += "${datadir}/wallpapers"
