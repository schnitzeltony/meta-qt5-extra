SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "93a379e907d3b03205771e1b5c20ea7d"
SRC_URI[sha256sum] = "1a6dec67e3c2a0f549ffe242353fdf8905c80aa48b1dc7261affd087465468dd"

FILES_${PN} += "${datadir}/wallpapers"
