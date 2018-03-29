SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c00d4ac152a7dfa5f299779e4a044dac"
SRC_URI[sha256sum] = "926c58efe562ad4425fbefdc4e562171e0bf4586e5ca7eedc04d5941f1c455f8"

FILES_${PN} += "${datadir}/wallpapers"
