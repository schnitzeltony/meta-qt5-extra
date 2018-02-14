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
SRC_URI[md5sum] = "6d717f754da760ab33a8c12ac1c37112"
SRC_URI[sha256sum] = "67890467af81d5330dc7f1c026de472d5b923250838e31ae3d8a2a78a75fb861"

FILES_${PN} += " \
    ${datadir}/bluedevilwizard \
    ${datadir}/mime \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/remoteview \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/bluetooth \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/bluetooth/.debug \
"
