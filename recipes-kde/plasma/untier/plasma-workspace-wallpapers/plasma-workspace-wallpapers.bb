SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d2b44e2ca3e7bba92850155856fa2965"
SRC_URI[sha256sum] = "a533e814d38ebfce4f24e7dee6b21470cb17fc0987a8322850b9954412ae3c15"

FILES_${PN} += "${datadir}/wallpapers"
