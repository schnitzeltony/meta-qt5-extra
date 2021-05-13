SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "759acd1b6de1e272c751d9366002038fef6617d6717d82262ec459584502404a"

FILES_${PN} += "${datadir}/wallpapers"
