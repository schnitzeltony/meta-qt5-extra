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
SRC_URI[md5sum] = "01644a7850e726f46a8714d209950115"
SRC_URI[sha256sum] = "d005d6c9485f188c076e72c13d5ece0d55187864988e7b4d6f15c2760f3d1584"

FILES_${PN} += " \
    ${datadir}/bluedevilwizard \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/remoteview \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/bluetooth \
"
