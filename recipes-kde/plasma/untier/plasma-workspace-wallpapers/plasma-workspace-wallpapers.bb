SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "98f2f023cc30116f0e677e752fb6220c"
SRC_URI[sha256sum] = "ff559fc487bdeaeedd55d45edabb8404f2a10484ec14400b1a8e99c0a298a210"

FILES_${PN} += "${datadir}/wallpapers"
