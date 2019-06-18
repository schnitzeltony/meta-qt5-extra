SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3943474fbcd805c7c1c47c0e5833e4fa"
SRC_URI[sha256sum] = "1e1fdbe7873c5028bf86793d6b37af0ad1e5afd298841df05f45e8a26e823965"

FILES_${PN} += "${datadir}/wallpapers"
