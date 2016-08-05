SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "63e20b7909d780d8b4fd258efae4e35a"
SRC_URI[sha256sum] = "3dcae149e5602ca7f6ee48ea326275f2cc14128eea44eb8073b7772370c4bc99"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plymouth/.debug \
"

