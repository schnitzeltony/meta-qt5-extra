SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "24cc446c50e04ee463a85b2e3ee74182"
SRC_URI[sha256sum] = "b7cbf02f16ccd75aa70f62bea79278577ae498f5a498ecd6dd572744b8f62fc4"

FILES_${PN} += "${datadir}/wallpapers"
