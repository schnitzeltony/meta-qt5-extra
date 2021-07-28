SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "d9da4dfea96c4aa1a7a9683f887573433777354691850ada62ed54c4221e7f29"

FILES_${PN} += "${datadir}/wallpapers"
