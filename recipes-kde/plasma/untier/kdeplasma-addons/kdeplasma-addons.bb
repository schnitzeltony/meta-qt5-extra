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
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kcmutils \
    plasma-framework \
    krunner \
    kservice \
    kpackage-native \
    sonnet \
    kunitconversion \
    kdelibs4support \
    kdelibs4support-native \
    kdesignerplugin-native \
    kross \
    knewstuff \
    sonnet-native \
    plasma-workspace \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "13a375d9be77841c7124855113b8ee31"
SRC_URI[sha256sum] = "1717f67907faee002006d4c11b95ec0100afbc6c0794aae065f1e226999fc49d"

FILES_SOLIBSDEV = " \
    ${libdir}/libplasma*core${SOLIBSDEV} \
"

FILES_${PN} += " \
    ${datadir}/kwin \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/icons \
    ${libdir}/libplasma*private.so \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/*/.debug \
"
