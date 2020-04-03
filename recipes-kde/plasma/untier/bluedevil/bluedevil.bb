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
SRC_URI[md5sum] = "9376ce923dd4dd5336b595839059d048"
SRC_URI[sha256sum] = "a542c606a235396f7144688c5ca8e50dda2fc566e3950f4c8e0988f67633a042"

FILES_${PN} += " \
    ${datadir}/bluedevilwizard \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/remoteview \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/bluetooth \
"
