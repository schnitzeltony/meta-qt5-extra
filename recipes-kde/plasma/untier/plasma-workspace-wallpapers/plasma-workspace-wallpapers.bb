SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "96291f7880bdc2a74a07b1aad9d868f0"
SRC_URI[sha256sum] = "dcc7f2d3d19dc72b76cd06b658dd300ac8783a737c0d84d05a17e28f1e2718df"

FILES_${PN} += "${datadir}/wallpapers"
