SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "efb3cde527a0cdd081475356172bb3fb"
SRC_URI[sha256sum] = "4a21809c01fe7a7c3e537b37ac6aedbd2cda1a3551ef44cd97de97dd88407cc0"

FILES_${PN} += "${datadir}/wallpapers"
