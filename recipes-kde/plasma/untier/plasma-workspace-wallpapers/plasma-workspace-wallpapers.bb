SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "cca6fe5e76ed2fa7734ab89bd3446937571ce6f5fd6d7670cf2aed05485cf394"

FILES:${PN} += "${datadir}/wallpapers"
