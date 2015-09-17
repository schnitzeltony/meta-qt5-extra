SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ff82dd9fdbaaf96a25f6a23f96bce5f7"
SRC_URI[sha256sum] = "31f223834328bf242c63f443bc6f52ea1819314433bbc79795a8994adab8225d"

FILES_${PN} += "${datadir}/wallpapers"
