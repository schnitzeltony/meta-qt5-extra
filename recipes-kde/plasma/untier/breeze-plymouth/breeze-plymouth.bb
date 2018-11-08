SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ff5acab4f564392f7ab4374fb040db57"
SRC_URI[sha256sum] = "fd51b203aac7379e993d04f26291885f0d02ad4a893ba8921d2dc3c96169a839"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plymouth/.debug \
"

