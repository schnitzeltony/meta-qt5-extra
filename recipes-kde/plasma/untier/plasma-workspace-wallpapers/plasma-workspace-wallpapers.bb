SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "dd6d03fa758fbb046e1a631d129223164a378b122ec17d900ac76cf47d18265b"

FILES:${PN} += "${datadir}/wallpapers"
