SUMMARY = "NetworkManager support for Liri"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "25521d5e29569f557f3bdfae527d81042c54d866"
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
