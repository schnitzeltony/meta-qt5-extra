SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4c7effdcce3b700b8fd9da1919e1a9ba"
SRC_URI[sha256sum] = "054e54bf076e39d879f3aa99ebc859f44197a21da2cd3eaf26cbffa1d29703bd"

FILES_${PN} += "${datadir}/wallpapers"
