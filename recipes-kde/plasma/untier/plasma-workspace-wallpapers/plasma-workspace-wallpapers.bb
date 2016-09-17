SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "90f5aec65705df157815982f7c23d8c2"
SRC_URI[sha256sum] = "f1ae44fe8dceab64ac2cbe53dbaa5c3b86b82b6c3681f24e801cd902aaddc4fc"

FILES_${PN} += "${datadir}/wallpapers"
