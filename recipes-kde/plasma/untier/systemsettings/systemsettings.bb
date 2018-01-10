SUMMARY = "KDE system settings"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    kdoctools-native \
    sonnet-native \
    kpackage-native \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
    kactivities \
    kactivities-stats \
    kirigami2 \
    kitemviews \
    kcmutils \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    kconfig \
    khtml \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "10aa28d4ceb878787197574805705948"
SRC_URI[sha256sum] = "1e754af7d88189314b00d9af8b8f396fe323ad1da647b90222a3a0820a758d79"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
