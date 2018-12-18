SUMMARY = "Responsive shell for Liri OS"
LICENSE = "LGPLv3 & GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri pythonnative distro_features_check gsettings

REQUIRED_DISTRO_FEATURES = "wayland pam"

SRC_URI += "file://0001-Install-liri-session-script-as-executable.patch"
PV = "0.9.0+git${SRCPV}"
SRCREV = "192e67c93c9acc871539b4e01d4d7c32111f7e93"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtwayland-native \
    libpam \
    qtwayland \
    qtquickcontrols2 \
    liri-qtaccountsservice \
    liri-qtgsettings \
    liri-eglfs \
    solid \
    polkit-qt-1 \
    pipewire \
"

EXTRA_OECMAKE += " \
    -DINSTALL_SYSCONFDIR=${sysconfdir} \
"

# for starter scripts (still necessary?)
RDEPENDS_${PN} = "qttools-tools qtwayland-plugins"

FILES_${PN} += " \
    ${systemd_user_unitdir} \
    ${datadir}/wayland-sessions \
    ${datadir}/desktop-directories \
    ${OE_QMAKE_PATH_QML} \
"

RREPLACES_${PN} = "hawaii-shell"
RPROVIDES_${PN} = "hawaii-shell"
RCONFLICTS_${PN} = "hawaii-shell"
