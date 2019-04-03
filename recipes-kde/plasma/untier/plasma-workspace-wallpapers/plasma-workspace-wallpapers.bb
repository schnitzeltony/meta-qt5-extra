SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e0818ddbc47f9f857b3f5172b8c5fe9c"
SRC_URI[sha256sum] = "ba8c66c85fdddc401eecae453d864af954daa181724cc168cddf2d1e93f9bd40"

FILES_${PN} += "${datadir}/wallpapers"
