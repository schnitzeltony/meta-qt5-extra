SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "424d4866704ec719ad81d3ff01287b13"
SRC_URI[sha256sum] = "bf11efae144e3e00623b565aedd5f48e24aba29ec03466d4f5b561e4ff214563"

FILES_${PN} += "${datadir}/wallpapers"
