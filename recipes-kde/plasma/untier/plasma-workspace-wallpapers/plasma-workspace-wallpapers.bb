SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "119b6732ac14447e49362d9544ff4431ed703dc03e7854926fbf72fd49ab4b29"

FILES:${PN} += "${datadir}/wallpapers"
