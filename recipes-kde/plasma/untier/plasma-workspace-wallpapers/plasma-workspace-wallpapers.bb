SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "bed0294d405d9452174e7974cafc0c11"
SRC_URI[sha256sum] = "dfdbef49a8b8feb27a0927bc28728fefed94943baebf97587f8b2284384eda84"

FILES_${PN} += "${datadir}/wallpapers"
