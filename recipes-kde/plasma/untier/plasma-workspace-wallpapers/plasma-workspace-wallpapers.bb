SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "95a6e9da0a652e6584f3727227813fe79a9c4defa7d789126a31fceff09853e2"

FILES_${PN} += "${datadir}/wallpapers"
