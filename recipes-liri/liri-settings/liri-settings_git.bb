SUMMARY = "Settings application for Liri OS"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.9.0+git${SRCPV}"

SRCREV = "58fd88465544fa4b0ce206c5e369eec57c1dbfee"
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

RREPLACES:${PN} = "hawaii-system-preferences"
RPROVIDES:${PN} = "hawaii-system-preferences"
RCONFLICTS:${PN} = "hawaii-system-preferences"
