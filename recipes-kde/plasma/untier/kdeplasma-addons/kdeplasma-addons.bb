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
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f72a71c6f52ae05e0040d9f2de5bc8ae"
SRC_URI[sha256sum] = "9472cf37d0f85fd1446e8f4e73fc7d221330c03241585cc549d28c52b1460682"

SRC_URI += "file://0001-showdesktop-do-check-HAVE_X11-correctly.patch"

FILES_${PN} += " \
    ${datadir}/kwin \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/icons \
    \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/.debug \
    ${libdir}/${QT_DIR_NAME}/plugins/*/*/.debug \
    ${libdir}/qml/org/kde/plasma/private/*/.debug \
"
