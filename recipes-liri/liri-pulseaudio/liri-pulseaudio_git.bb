SUMMARY = "PulseAudio support for Liri"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "pulseaudio"

PV = "0.9.0+git${SRCPV}"

SRCREV = "d4f3b905ad6c4854c997dfc0afc6beccba64e669"
S = "${WORKDIR}/git"

DEPENDS += " \
    liri-fluid \
    pulseaudio \
"

FILES:${PN} += " \
    ${datadir}/liri-shell/indicators \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"
