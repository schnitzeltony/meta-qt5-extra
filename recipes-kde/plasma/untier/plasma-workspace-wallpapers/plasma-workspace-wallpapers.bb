SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "20eaf7b6afbf93aa878d37816dd31676"
SRC_URI[sha256sum] = "16cd20aaa78394d312715b38bf95caefb716bf3359e05313fbcf278e8cfe4c53"

FILES_${PN} += "${datadir}/wallpapers"
