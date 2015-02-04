SUMMARY = "KWRITED"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kpty \
    knotifications \
    kdbusaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d7b9ed7c9cb9ef517114c19df30bca4c"
SRC_URI[sha256sum] = "eb4b36d0f82bc6668ccee349ff70cf2743635a43efa68809c55338530fade165"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
