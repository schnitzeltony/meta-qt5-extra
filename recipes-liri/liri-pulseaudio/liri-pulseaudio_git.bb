SUMMARY = "PulseAudio support for Liri"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "pulseaudio"

PV = "0.9.0+git${SRCPV}"

SRCREV = "574d361fb904feffcef04625bbf520ded4b23483"
S = "${WORKDIR}/git"

DEPENDS += " \
    liri-fluid \
    pulseaudio \
"

FILES:${PN} += " \
    ${datadir}/liri-shell/indicators \
    ${datadir}/liri-settings/modules \
    ${datadir}/liri-shell \
    ${OE_QMAKE_PATH_QML} \
"
