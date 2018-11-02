SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "bd3c40a852118b38f721749c15141ad9"
SRC_URI[sha256sum] = "e8ff3f245af7592bfaf9a927afa49cf98b472bfc229edbf544202405b3dfcdc3"

FILES_${PN} += "${datadir}/wallpapers"
