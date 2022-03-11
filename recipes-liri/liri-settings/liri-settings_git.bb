SUMMARY = "Settings application for Liri OS"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.9.0+git${SRCPV}"

SRCREV = "ebf3b0114a0b6d433b41b379d74f4ff0b4e765ae"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtquickcontrols2 \
    liri-libliri \
    liri-qtaccountsservice \
    liri-fluid \
    polkit \
    xkeyboard-config \
"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"
