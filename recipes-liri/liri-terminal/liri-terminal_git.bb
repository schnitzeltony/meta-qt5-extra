SUMMARY = "Terminal emulator"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri gsettings

SRC_URI += "file://0001-remove-Werror-from-build-flags.patch"
PV = "0.0.0+git${SRCPV}"
SRCREV = "1b428ebf54b7768723f806abdf62e24bc9b1b48a"
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
