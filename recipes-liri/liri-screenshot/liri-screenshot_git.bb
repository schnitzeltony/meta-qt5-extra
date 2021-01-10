SUMMARY = "Utility to capture the screen of a Liri desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation

DEPENDS += " \
    qtquickcontrols2 \
    liri-wayland \
"

PV = "0.9.0+git${SRCPV}"
SRCREV = "2a7dba67156961dc9853799a6c4267ac0419c0bf"
S = "${WORKDIR}/git"
