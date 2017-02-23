SUMMARY = "Integrate Bluetooth within KDE workspace and applications"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = " \
    file://HACKING;md5=ea929f30c0ac1f4fe1a778821aecc4cd \
"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    kwidgetsaddons \
    kdbusaddons \
    knotifications \
    kwindowsystem \
    kiconthemes \
    plasma-framework \
    ki18n \
    kio \
    bluez-qt \
    kded \
    shared-mime-info \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9b5ea9445306520190a54e1e72b25d81"
SRC_URI[sha256sum] = "2316c455f8656d3e59d7780be94e751197781b9d2bf5e991d1d3295fa9637c1a"

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
