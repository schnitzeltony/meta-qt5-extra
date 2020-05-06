SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e1e1e30bf1b6ccbe245189e19f212777"
SRC_URI[sha256sum] = "f8da3bd7b97a9944639ed0860303b8a7a008905246313e1983367810a3a84d6d"

FILES_${PN} += "${datadir}/wallpapers"
