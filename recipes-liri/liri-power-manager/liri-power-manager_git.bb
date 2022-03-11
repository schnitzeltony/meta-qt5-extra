SUMMARY = "Power management support for Liri"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation gsettings

PV = "0.9.0+git${SRCPV}"

SRCREV = "82662ac5d44e51136300dc6817d95c34eda1ad3a"
S = "${WORKDIR}/git"
SRC_URI += "file://0001-batterywatcher-Fix-build-with-KF5-Solid-5.91.0.patch"

DEPENDS += " \
    qtwayland \
    qtgraphicaleffects \
    qtquickcontrols2 \
    qtsvg \
    liri-fluid \
    liri-qtgsettings \
    liri-libliri \
    liri-session \
    solid \
"

EXTRA_OECMAKE += "-DINSTALL_SYSCONFDIR=${sysconfdir}"

FILES:${PN} += " \
    ${datadir}/liri-settings \
    ${datadir}/liri-shell \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"
