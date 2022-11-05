SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "ee0ebc868521f0f1163f9cdabeadd3473f74cb7548b4cb4a4cd2d3134f245ece"

FILES:${PN} += "${datadir}/wallpapers"
