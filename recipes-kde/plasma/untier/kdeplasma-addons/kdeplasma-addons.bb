SUMMARY = "All kind of addons to improve your Plasma experience"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtdeclarative \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    karchive \
    kdeclarative \
    kholidays \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    kross \
    knotifications \
    plasma-framework \
    krunner \
    kservice \
    sonnet \
    kunitconversion \
    kwindowsystem \
    knewstuff \
    purpose \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "66cf356c39e8e5a361fa5bdbac07ea0e"
SRC_URI[sha256sum] = "4c0884dcb8413fa836d7e390b1c12fc71127c0e5e6fa278a338c253d1539f4a1"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kdevappwizard \
    ${datadir}/knsrcfiles \
    ${datadir}/k*5 \
    ${datadir}/kwin \
    ${datadir}/plasma \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
