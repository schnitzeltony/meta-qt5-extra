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
SRC_URI[md5sum] = "bc10f321f5ea2a605be29d8cba6b9bc5"
SRC_URI[sha256sum] = "a0b5b46f4ffae99ff2b591703e3fc82f3af1f12d1929c7980c28367ddc2abdab"

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
