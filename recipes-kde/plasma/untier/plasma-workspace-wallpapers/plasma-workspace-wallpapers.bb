SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "dbbf224c5f626d6e93aa049f05c79824"
SRC_URI[sha256sum] = "db91021bb3df99aeaf55e9d9e09b06c0b24c98f34e5adada35dc0fae613bdada"

FILES_${PN} += "${datadir}/wallpapers"
