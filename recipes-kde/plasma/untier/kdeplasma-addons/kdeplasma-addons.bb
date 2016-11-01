SUMMARY = "All kind of addons to improve your Plasma experience"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    qtdeclarative \
    \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    ki18n \
    kcmutils \
    plasma-framework \
    krunner \
    kservice \
    sonnet \
    kunitconversion \
    kdelibs4support \
    kross \
    knewstuff \
    plasma-workspace \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "10e79c1d2ff4c0eac46afa3d1d45e40d"
SRC_URI[sha256sum] = "63220c0b7301eb44ef3e96d4f1a7085b340a0bd49884d26b52237eb7333853eb"

FILES_${PN} += " \
    ${datadir}/kwin \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/icons \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/private/*/.debug \
"
