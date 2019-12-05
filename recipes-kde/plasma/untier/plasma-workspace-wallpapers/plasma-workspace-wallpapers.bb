SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3a529d45d833cf56b26cbc84e9ca7f18"
SRC_URI[sha256sum] = "a74405d1267e88b126e3d6f785424c92297e19426bc185b69bc737a3199e82bd"

FILES_${PN} += "${datadir}/wallpapers"
