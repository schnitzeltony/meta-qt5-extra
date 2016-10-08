SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "2a16baba23a9c9f18acc03f10b5ed670"
SRC_URI[sha256sum] = "4f94aef530c7b3845c2128a13097d1968b460b88b57a00b522c14e75f97bc7d9"

FILES_${PN} += "${datadir}/wallpapers"
