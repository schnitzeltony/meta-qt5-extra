SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "96b3bce05e95880f2d971f0e50ddc997"
SRC_URI[sha256sum] = "dc67f29fcf9a721bc5b00ddca66bd81e3ad50383be7459262d2e048bae68b163"

FILES_${PN} += "${datadir}/wallpapers"
