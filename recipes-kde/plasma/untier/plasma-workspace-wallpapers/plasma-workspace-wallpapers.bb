SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "039f968956a4df147cbbc5175d912406"
SRC_URI[sha256sum] = "b7dd2496352bed3eaf8eae2db225999974b282614d08759691a8519ecad5a6df"

FILES_${PN} += "${datadir}/wallpapers"
