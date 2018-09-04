SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9066a68f2b5a18ee00ee8d383a9c9225"
SRC_URI[sha256sum] = "afa6c74df4746fa39e6b22431f301d3c4a9d21bd6336f2a2d6a2bffd97a976f1"

FILES_${PN} += "${datadir}/wallpapers"
