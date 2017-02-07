SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0426b9c03d0ab1a1bac33592a0a2b080"
SRC_URI[sha256sum] = "54f8bc7e93febdc4f60106cde5813c43998748ad1f44c5bf30df5aa09f58b053"

FILES_${PN} += "${datadir}/wallpapers"
