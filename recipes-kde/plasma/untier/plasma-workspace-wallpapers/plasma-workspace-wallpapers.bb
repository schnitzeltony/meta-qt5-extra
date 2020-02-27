SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "47494086890acf4f99849ff89d597e57"
SRC_URI[sha256sum] = "b5fe558d7da275834bd1cb4cdb398a619a606fe267b4d4b580cc0c8db10db1b8"

FILES_${PN} += "${datadir}/wallpapers"
