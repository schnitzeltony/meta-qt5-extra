SUMMARY = "Utility to capture the screen of a Liri desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

DEPENDS += " \
    qtquickcontrols2 \
"

PV = "0.9.0+git${SRCPV}"
SRCREV = "50839f8dc7dfb21f7e44ef1657ffc84683624961"
S = "${WORKDIR}/git"
