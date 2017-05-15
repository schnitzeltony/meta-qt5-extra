SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "31c869ba6a8ecfe5ed6b33d5aae65766"
SRC_URI[sha256sum] = "56d7461e1449a7e842080200429ba2743581e9e861ea9a7ee3007658f5366516"

FILES_${PN} += "${datadir}/wallpapers"
