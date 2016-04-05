SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8cebf8ac0f6c2f9b5297af438728f0a7"
SRC_URI[sha256sum] = "fa51f1e55754bb36da2b045e208ac07b322c39f3dd8b665d19a0e088ac66faa5"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
