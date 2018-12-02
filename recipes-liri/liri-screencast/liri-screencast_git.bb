SUMMARY = "Qt wrapper for GSettings"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

DEPENDS += " \
    qt-gstreamer \
"

PV = "0.9.0+git${SRCPV}"
SRCREV = "07eae89d912521271584c2acb7388774690f0d30"
S = "${WORKDIR}/git"
