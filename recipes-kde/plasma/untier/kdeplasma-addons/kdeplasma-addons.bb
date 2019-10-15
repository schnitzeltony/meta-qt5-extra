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
SRC_URI[md5sum] = "be9bb150c31b1d04315c6ae476bf2916"
SRC_URI[sha256sum] = "d4c6ab840f61dcdc52b925045614f9de4089dc2fdf89726fd7c8638c521eb42e"

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
