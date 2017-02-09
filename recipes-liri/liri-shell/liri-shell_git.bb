SUMMARY = "Responsive shell for Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri systemd pythonnative distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland pam"

SRC_URI += " \
    file://0001-find-host-s-git.patch \
    file://0002-remove-Werror-from-build-flags.patch \
"
PV = "0.9.0+git${SRCPV}"
SRCREV = "53a85487e7f4de25982cdb4490b9576be24459e7"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtaccountsservice \
    libpam \
    vibe \
    liri-wayland \
    liri-workspace \
"

EXTRA_OECMAKE += " \
    -DSYSTEMD_USER_UNIT_DIR=${systemd_system_unitdir} \
"

SYSTEMD_SERVICE_${PN} = "liri.service"

# for starter scripts
RDEPENDS_${PN} = "qttools-tools qtwayland-plugins"

# REVISIT optionals
RRECOMMENDS_${PN} += " \
    liri-wallpapers \
    paper-icon-theme \
"

FILES_${PN} += " \
    ${datadir} \
    ${systemd_unitdir} \
    ${OE_QMAKE_PATH_QML}/Liri \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_QML}/Liri/*/.debug \
"

RREPLACES_${PN} = "hawaii-shell"
RPROVIDES_${PN} = "hawaii-shell"
RCONFLICTS_${PN} = "hawaii-shell"
