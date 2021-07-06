SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "e3e2ee7bc6cf46c8976644c15a7fc5bb96354c07840fca8a2da3fc9ddd375e75"

FILES_${PN} += "${datadir}/wallpapers"
