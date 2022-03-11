SUMMARY = "Screencast tool"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation

DEPENDS += " \
    gstreamer1.0 \
    liri-wayland \
"

PV = "0.0.0+git${SRCPV}"
SRCREV = "8518f728bd587c8556fc15e36612bbd3c77cfade"
S = "${WORKDIR}/git"
