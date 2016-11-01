SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "61e414c11737a7d68508e7ca2bf23961"
SRC_URI[sha256sum] = "e2698f8292f8f1e8e714e9c3512418d9389c2bd4d8ec35c3297571d280e1c337"

FILES_${PN} += "${datadir}/wallpapers"
