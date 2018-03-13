SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4719a83a8bbe073749431affeea01b6b"
SRC_URI[sha256sum] = "1ba0c2884cf2f0836c791403b7b8dc53d60044ae58be4f53adf6fe761a70b73e"

FILES_${PN} += "${datadir}/wallpapers"
