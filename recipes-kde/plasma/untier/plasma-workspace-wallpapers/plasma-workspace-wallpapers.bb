SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "5896ef78ebf9b4784ed1fb44c4af1d69"
SRC_URI[sha256sum] = "268e936fe184c74e46e1de99b419bb5d189d7dbdeca5ec3e71b34799c1066ccf"

FILES_${PN} += "${datadir}/wallpapers"
