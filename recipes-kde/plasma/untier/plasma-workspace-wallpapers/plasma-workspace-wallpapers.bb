SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c35079353bdb80411b198eb4102e42b2"
SRC_URI[sha256sum] = "22bf5e528867e3534802cfe0e5481cf88488071479480890866c95893c095712"

FILES_${PN} += "${datadir}/wallpapers"
