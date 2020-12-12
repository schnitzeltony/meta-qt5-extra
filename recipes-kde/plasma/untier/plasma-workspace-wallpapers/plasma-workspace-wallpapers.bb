SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "4740d67e85910ed398c048916963f31c6632698d6a4494bc09cc1b0cd14e2808"

FILES_${PN} += "${datadir}/wallpapers"
