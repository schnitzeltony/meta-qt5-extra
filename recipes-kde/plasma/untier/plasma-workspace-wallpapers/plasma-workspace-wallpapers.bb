SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "25fcaf7cb52f20b3126af9baa1409e3c"
SRC_URI[sha256sum] = "8b4809e6847000510a50bf2e265bc75958f789e0a0cf3dc07c587637fa11afc3"

FILES_${PN} += "${datadir}/wallpapers"
