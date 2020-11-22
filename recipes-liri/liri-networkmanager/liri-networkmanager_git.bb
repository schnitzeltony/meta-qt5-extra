SUMMARY = "NetworkManager support for Liri"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "bcd5806d237da97f5901dc6d29b68f57666e45f6"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
    liri-session \
    networkmanager-qt \
    modemmanager-qt \
"

FILES_${PN} += " \
    ${datadir}/liri-shell/indicators \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"
