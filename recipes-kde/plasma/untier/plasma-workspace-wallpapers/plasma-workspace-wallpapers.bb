SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "333f32a4fa521646610295174ec5c4c9"
SRC_URI[sha256sum] = "1274d614a0a72893778aa76f5c2e04fea610215b7f2e11924abd712e514db1d2"

FILES_${PN} += "${datadir}/wallpapers"
