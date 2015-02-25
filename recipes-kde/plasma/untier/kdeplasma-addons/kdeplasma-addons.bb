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
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9bd19b65f6c8692a1e24fd60629b64b0"
SRC_URI[sha256sum] = "239f137c78715c661f53364cff353581c323164ab870ec3fa04be2008b33cbd1"

SRC_URI += "file://0001-showdesktop-do-check-HAVE_X11-correctly.patch"

FILES_${PN} += " \
    ${datadir}/kwin \
    ${datadir}/kservices5 \
    ${datadir}/plasma \
    ${datadir}/icons \
    \
    ${libdir}/plugins \
    ${libdir}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/plugins/plasma/dataengine/.debug \
    ${libdir}/qml/org/kde/plasma/private/*/.debug \
"
