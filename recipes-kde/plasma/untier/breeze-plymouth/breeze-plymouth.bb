SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "957da865be8f9664b4ec5bf19ca2ad37"
SRC_URI[sha256sum] = "236605aa905261d6cc21b3900353c1d1a7d4c33946b8d0930cc7fe8d75ceae79"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"

FILES_${PN}-dbg += " \
    ${libdir}/plymouth/.debug \
"

