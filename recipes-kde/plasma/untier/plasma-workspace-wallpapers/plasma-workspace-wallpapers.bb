SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8084aacbe6a67af034612c38340db372"
SRC_URI[sha256sum] = "af1c669d5561682e486990f817906d7d3f55af62a6deb28cabbf3ce627e002ba"

FILES_${PN} += "${datadir}/wallpapers"
