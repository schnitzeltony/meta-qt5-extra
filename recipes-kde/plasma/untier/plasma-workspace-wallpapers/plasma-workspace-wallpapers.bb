SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6290853bcc8e4d21fd16a714b0f01cbe"
SRC_URI[sha256sum] = "03bba0805c626902c684e5e8d6d8169730f2c3cecacd8323a4f9ba275388ffdb"

FILES_${PN} += "${datadir}/wallpapers"
