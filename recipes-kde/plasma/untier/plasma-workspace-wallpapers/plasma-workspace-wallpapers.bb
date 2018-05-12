SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "30c03aeab0d69d87d08a5b1e57468f8c"
SRC_URI[sha256sum] = "47195c111ab7d1b3f769d1929192341929b8d00e1036d7b8bc4000dea662d3dc"

FILES_${PN} += "${datadir}/wallpapers"
