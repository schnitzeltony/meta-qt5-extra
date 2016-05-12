SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c9f705a24072758d277486ab55d981de"
SRC_URI[sha256sum] = "0e70b379eb4a17d5eb1f554e59fdc7c696d1afd3d45a1e6262aab659095dbded"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
