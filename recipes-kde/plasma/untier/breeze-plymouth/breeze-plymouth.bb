SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1b26730776ef52f8bb622250aa4c8aca"
SRC_URI[sha256sum] = "13aa162040f5e0524e04aa50d382bc2e3158b297bf026a729abcdfb955e6713e"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
