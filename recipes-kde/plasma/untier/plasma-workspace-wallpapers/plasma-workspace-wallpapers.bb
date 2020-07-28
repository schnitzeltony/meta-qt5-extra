SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "569c55902960eda4658634bac40dd22e"
SRC_URI[sha256sum] = "4cec20329847e655649ad41bfc290815cc97d494de385b40f679694d9db3f23e"

FILES_${PN} += "${datadir}/wallpapers"
