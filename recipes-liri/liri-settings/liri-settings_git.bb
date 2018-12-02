SUMMARY = "Settings application for Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.9.0+git${SRCPV}"

SRCREV = "d5f5881da698fcb5e5b8e9e9176b85cd9f9cccbc"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtquickcontrols2 \
    liri-qtaccountsservice \
    liri-fluid \
    libqtxdg \
    polkit \
    xkeyboard-config \
"

FILES_${PN} += " \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"

RREPLACES_${PN} = "hawaii-system-preferences"
RPROVIDES_${PN} = "hawaii-system-preferences"
RCONFLICTS_${PN} = "hawaii-system-preferences"
