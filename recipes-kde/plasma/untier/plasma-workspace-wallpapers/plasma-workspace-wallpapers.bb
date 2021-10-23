SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "fb26b880b60e893f08f51e17a845d6e252ce744441947e6e6119913689edf4aa"

FILES:${PN} += "${datadir}/wallpapers"
