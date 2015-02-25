SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    qtsvg \
    qtdeclarative \
    \
    kwidgetsaddons \
    kcoreaddons \
    solid \
    kconfig \
    kwallet \
    kdbusaddons \
    ki18n \
    kconfigwidgets \
    knotifications \
    kdeclarative \
    phonon \
    attica \
    knewstuff \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "603c4a7305d0f70691650e412e0160b4"
SRC_URI[sha256sum] = "ae4fbf3282d29c745e9c9daae129a94e80b98a2708d360bfa606026d053eaa84"

FILES_SOLIBSDEV = "${libdir}/libmuonprivate${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/libmuon \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/muondiscover \
    ${datadir}/icons \
    ${datadir}/desktoptheme \
    ${datadir}/muonabstractnotifier \
    \
    ${libdir}/libMuonNotifiers.so \
    ${libdir}/plugins \
    ${libdir}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/*/.debug \
    ${libdir}/qml/org/kde/*/.debug \
"
