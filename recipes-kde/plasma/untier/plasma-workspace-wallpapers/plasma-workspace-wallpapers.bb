SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "9565979e572c802f3ef78554f992c09667fd9e7dc9be270fc853e8b360070496"

FILES_${PN} += "${datadir}/wallpapers"
