SUMMARY = "A Material Design terminal"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation gsettings

DEPENDS += " \
    liri-fluid \
    liri-qtgsettings \
"

PV = "0.2.0+git${SRCPV}"
SRCREV = "025cd4a2ac94ca2fdf05a3c8f571e059331af28b"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${PN}/color-schemes \
    ${datadir}/${PN}/kb-layouts \
    ${OE_QMAKE_PATH_QML} \
"

RREPLACES:${PN} = "hawaii-terminal"
RPROVIDES:${PN} = "hawaii-terminal"
RCONFLICTS:${PN} = "hawaii-terminal"
