SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c11a60c69784c57c03f841c03fa966c9"
SRC_URI[sha256sum] = "4ada62b8f33cf70ebf53ba3cc67177eebd8980da3f883247ea4498428823914d"

FILES_${PN} += "${datadir}/wallpapers"
