SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8ad2e9423bd01f7302652fe3a79d2484"
SRC_URI[sha256sum] = "71a67a759b670b46d3ba34d3d77df4fc30b635ca88121bd9935596364294120c"

FILES_${PN} += "${datadir}/wallpapers"
