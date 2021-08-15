SUMMARY = "Session manager for Liri OS"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri gsettings

PV = "0.1.0+git${SRCPV}"

SRC_URI += "file://0001-menu-use-correct-install-variables.patch"
SRCREV = "2840b1b218afd53f85e9422dd169949d2e06b2ca"
S = "${WORKDIR}/git"

DEPENDS += " \
   liri-qtgsettings \
   liri-libliri \
"

FILES:${PN} += " \
    ${datadir}/desktop-directories \
    ${datadir}/liri-session/systemd-user/autostart \
    ${datadir}/wayland-sessions \
    ${systemd_user_unitdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
"
