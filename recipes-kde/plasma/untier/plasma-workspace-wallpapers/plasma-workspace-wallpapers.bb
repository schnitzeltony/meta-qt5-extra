SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ec3c7d6500ac33de1c170b9df0d002a4"
SRC_URI[sha256sum] = "fd35ccae41085091d8898b5d119004ab96a799cee9cf8faa838d8baa7df0333e"

FILES_${PN} += "${datadir}/wallpapers"
