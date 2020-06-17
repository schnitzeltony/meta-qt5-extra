SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3e3f26b8925131e8390995466fb8df8b"
SRC_URI[sha256sum] = "c14d607a1b6544ddb301d58a0f78a7aecd06b1ec6c131a960a0de557c070135e"

FILES_${PN} += "${datadir}/wallpapers"
