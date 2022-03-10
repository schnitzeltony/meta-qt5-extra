SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "7e2e65f0d51d585fa462612fa60d7190b4c681b795ad5717086f57240119bdf6"

FILES:${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
