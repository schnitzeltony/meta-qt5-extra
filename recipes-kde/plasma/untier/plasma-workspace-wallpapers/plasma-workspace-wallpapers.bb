SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4860b734e12930c11934ce8b8947acb4"
SRC_URI[sha256sum] = "09b499ca693dab75420fbee2256123bf9d0033d4788a817ac687c08303a8bc49"

FILES_${PN} += "${datadir}/wallpapers"
