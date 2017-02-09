SUMMARY = "Workspace, programs and plugins for Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri gsettings

PV = "0.9.0+git${SRCPV}"

SRCREV = "3fe96923a1b6daef6e76b46ff29dd8ae97d8624c"
S = "${WORKDIR}/git"

DEPENDS += " \
    liri-wayland \
    vibe \
    paper-icon-theme \
    qt-gstreamer \
    dconf \
"

EXTRA_OECMAKE += " \
    -DSYSTEMD_USER_UNIT_DIR=${systemd_system_unitdir} \
"

FILES_${PN} += " \
    ${datadir}/glib-2.0 \
    ${datadir}/desktop-directories \
    ${datadir}/liri-workspace/translations/*.qm \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RREPLACES_${PN} = "hawaii-baseapps hawaii-workspace"
RPROVIDES_${PN} = "hawaii-baseapps hawaii-workspace"
RCONFLICTS_${PN} = "hawaii-baseapps hawaii-workspace"
