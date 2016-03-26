SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "751c26021ad463215d1e57cbf8f976f5"
SRC_URI[sha256sum] = "e4ceca3d6b3a76d8ed03065eb393aeabaa94d4dd6f575a304c59b38302c19dd6"

FILES_${PN} += "${datadir}/wallpapers"
