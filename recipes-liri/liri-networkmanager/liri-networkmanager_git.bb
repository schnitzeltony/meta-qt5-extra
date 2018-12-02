SUMMARY = "NetworkManager support for Liri"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "5d3e76b7e9daedbdf92ec349ebf9653f2a933813"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
    networkmanager-qt \
    modemmanager-qt \
"

FILES_${PN} += " \
    ${datadir}/liri-shell/indicators \
    ${datadir}/liri-settings/modules \
    ${OE_QMAKE_PATH_QML} \
"
