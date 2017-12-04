SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "df943e57ebba65150df11b824fac5154"
SRC_URI[sha256sum] = "70d2293dd0691375e7b0c9fa8c08a0b159ea222f653bb5136e4ea056501c0627"

FILES_${PN} += "${datadir}/wallpapers"
