SUMMARY = "Integrate Bluetooth within KDE workspace and applications"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = " \
    file://HACKING;md5=ea929f30c0ac1f4fe1a778821aecc4cd \
"

inherit kde-plasma gettext mime

DEPENDS += " \
    kauth-native \
    kcoreaddons \
    kcoreaddons-native \
    kwidgetsaddons \
    kdbusaddons \
    knotifications \
    kwindowsystem \
    kiconthemes \
    kpackage-native \
    plasma-framework \
    ki18n \
    kio \
    bluez-qt \
    kded \
    shared-mime-info-native \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "88d833f3b31c79ade207a908eeacf4be"
SRC_URI[sha256sum] = "5350efbaee01c78fd451e96bb2aceb7986d45ab05500476d1e95c4e79ec89a66"

FILES_${PN} += " \
    ${datadir}/bluedevilwizard \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/remoteview \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/bluetooth \
"
