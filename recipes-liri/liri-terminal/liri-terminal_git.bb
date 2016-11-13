SUMMARY = "Terminal emulator"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri gsettings

PV = "0.1.0+git${SRCPV}"

SRCREV = "e6b33d1700f454e2c50f74756aa2579fc4994996"
S = "${WORKDIR}/git"

DEPENDS += " \
    vibe \
"

FILES_${PN} += " \
    ${datadir}/glib-2.0/schemas \
    ${datadir}/appdata \
    ${datadir}/applications \
    ${OE_QMAKE_PATH_QML}/Liri/Terminal \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/Liri/*/.debug \
"

RREPLACES_${PN} = "hawaii-terminal"
RPROVIDES_${PN} = "hawaii-terminal"
RCONFLICTS_${PN} = "hawaii-terminal"
