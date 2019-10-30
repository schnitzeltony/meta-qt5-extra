SUMMARY = "Integrate Bluetooth within KDE workspace and applications"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = " \
    file://HACKING;md5=ea929f30c0ac1f4fe1a778821aecc4cd \
"

inherit kde-plasma gettext

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
SRC_URI[md5sum] = "85df346e47ac115516fad722cabba8d7"
SRC_URI[sha256sum] = "05e22ff2e719ddafd1a18e0dd1766743f0879aab8d7ba3f366a6cc407e00c697"

FILES_${PN} += " \
    ${datadir}/bluedevilwizard \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/remoteview \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/bluetooth \
"
