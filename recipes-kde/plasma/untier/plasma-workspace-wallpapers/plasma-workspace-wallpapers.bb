SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8575fbac39aaa29cd393f04a9709ca08"
SRC_URI[sha256sum] = "d583cb53693dc073d48bacf9b1dc05b71baf3112bb70af7c3756265f380065f5"

FILES_${PN} += "${datadir}/wallpapers"
