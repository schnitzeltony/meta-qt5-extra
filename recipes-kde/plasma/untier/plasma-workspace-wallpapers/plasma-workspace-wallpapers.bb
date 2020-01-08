SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ade7cc861b6e35050012553b45c4320b"
SRC_URI[sha256sum] = "8a28ef67b65c340d40ff8f5bfc333ead68e6d8c9e410769c43af847ced9b4ca9"

FILES_${PN} += "${datadir}/wallpapers"
