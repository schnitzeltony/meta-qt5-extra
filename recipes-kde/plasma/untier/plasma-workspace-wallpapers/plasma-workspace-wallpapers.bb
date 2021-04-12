SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "c706e4293b3c0552503abc55eaa0d971203b23ad252804f0fb95b9b040fad8d7"

FILES_${PN} += "${datadir}/wallpapers"
