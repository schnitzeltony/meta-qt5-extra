SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "da252edb70b3373c38fb30318a44f52f047d4f31cbbd26c01c30bf2398c43848"

FILES:${PN} += "${datadir}/wallpapers"
