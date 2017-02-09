SUMMARY = "Workspace, programs and plugins for Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri gsettings

PV = "0.10.0+git${SRCPV}"

SRCREV = "8ad42e0d334abee991dfebb9381d728def5330b3"
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
