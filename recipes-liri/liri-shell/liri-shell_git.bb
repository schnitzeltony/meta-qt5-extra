SUMMARY = "Responsive shell for Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri systemd pythonnative distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland pam"

PV = "0.10.0+git${SRCPV}"

SRC_URI += " \
    file://0001-find-host-s-git.patch \
"
SRCREV = "ba7353b01c9c87c3ec8226a2f931dc8f2a72bf3b"
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
