SUMMARY = "Power management support for Liri"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri gsettings

PV = "0.9.0+git${SRCPV}"

SRCREV = "794ef0dc8a139b62fad277699042232191487186"
S = "${WORKDIR}/git"

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

FILES_${PN} += " \
    ${datadir}/liri-settings \
    ${datadir}/liri-shell \
    ${OE_QMAKE_PATH_QML} \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"
