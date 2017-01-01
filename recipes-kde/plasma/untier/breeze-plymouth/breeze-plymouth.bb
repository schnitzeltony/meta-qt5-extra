SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "aabf2642c359fb48337068435a432454"
SRC_URI[sha256sum] = "01c74f5422382dd6b1ad8777a971dc58b43122980592174fbc7f01feb314cbe7"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plymouth/.debug \
"

