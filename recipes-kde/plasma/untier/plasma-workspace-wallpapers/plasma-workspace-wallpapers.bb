SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "90eddae144bfdef3f2b653eddbca75b2"
SRC_URI[sha256sum] = "2ccb9e1549bbf7d5e6aadaf11cddf32d9990d9f72fcc5366a3bc224cb80c8ec2"

FILES_${PN} += "${datadir}/wallpapers"
