SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "5a9432073012423531f311a2ba441c03242625b04dbd8a2b0f175afe3eeee4cf"

FILES:${PN} += "${datadir}/wallpapers"
