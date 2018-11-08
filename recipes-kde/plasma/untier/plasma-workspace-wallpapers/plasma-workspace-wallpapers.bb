SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0107319a5f425f1c1a8cdeee63b7edd7"
SRC_URI[sha256sum] = "4b925a4a0795c1649028c71b1519e140de5448572e8c88e53103ae4272f39c25"

FILES_${PN} += "${datadir}/wallpapers"
