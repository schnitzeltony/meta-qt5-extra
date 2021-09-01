SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "be214397f580adff039f28b37758b5a19da01f35ef5ee9ddb3fe93c0f116a8c0"

FILES:${PN} += "${datadir}/wallpapers"
