SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "243cf6bb613d30ccb92e183938dcd3e02c1c7a11624a447c35c56a5eac3def42"

FILES:${PN} += "${datadir}/wallpapers"
