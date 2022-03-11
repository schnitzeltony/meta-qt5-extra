SUMMARY = "NetworkManager support for Liri"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri qt5-translation

PV = "0.9.0+git${SRCPV}"

SRCREV = "e451da23d58391c6075f4143ab0d1b7d37ffd65b"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
    liri-session \
    networkmanager-qt \
    modemmanager-qt \
"

FILES:${PN} += " \
    ${datadir}/liri-shell \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"
