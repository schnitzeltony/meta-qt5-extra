SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ba5914eb9fb142798f8ff2acb4b355ac"
SRC_URI[sha256sum] = "01097a93eb0310883be9f6ab5d7e8506be47a243bcf978d04b207783d4a1cf4a"

FILES_${PN} += "${datadir}/wallpapers"
