SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "22ec9136b0b539c7213633ce19abf2c0"
SRC_URI[sha256sum] = "3885dfd118b5889e2473d846a0ff44854c45cc416bc498298cc708120b32009f"

FILES_${PN} += "${datadir}/wallpapers"
