SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b68a7d75f28d7a4516cbfaee24d93733"
SRC_URI[sha256sum] = "67d3e69d9ad6292cf6b70ab7f35fe0a88d2a626efd0a1c4fa70b5c0049d1c973"

FILES_${PN} += "${datadir}/wallpapers"
