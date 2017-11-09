SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6b5f5b49540520c4ebab9e681a976e5a"
SRC_URI[sha256sum] = "e6e853bfea64ed77d199232d248ab4995cace3bd16aa7b357dd031721e2ba686"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plymouth/.debug \
"

