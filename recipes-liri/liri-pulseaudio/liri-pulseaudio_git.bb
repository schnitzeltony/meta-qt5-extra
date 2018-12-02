SUMMARY = "PulseAudio support for Liri"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri distro_features_check

REQUIRED_DISTRO_FEATURES = "pulseaudio"

PV = "0.9.0+git${SRCPV}"

SRCREV = "fdfb2e9bb9142cf2704b3e1a7d0ef9db9c1481fb"
S = "${WORKDIR}/git"

DEPENDS += " \
    liri-fluid \
    pulseaudio \
"

FILES_${PN} += " \
    ${datadir}/liri-shell/indicators \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"
