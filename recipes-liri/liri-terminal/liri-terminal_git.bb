SUMMARY = "A Material Design terminal"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri gsettings

DEPENDS += " \
    liri-fluid \
    liri-qtgsettings \
"

PV = "0.2.0+git${SRCPV}"
SRCREV = "15759fc592457d8b26a271491bf45db43825f52f"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${PN}/color-schemes \
    ${datadir}/${PN}/kb-layouts \
    ${OE_QMAKE_PATH_QML} \
"

RREPLACES_${PN} = "hawaii-terminal"
RPROVIDES_${PN} = "hawaii-terminal"
RCONFLICTS_${PN} = "hawaii-terminal"
