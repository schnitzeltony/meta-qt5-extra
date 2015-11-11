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
SRC_URI[md5sum] = "20cce4f714d1341049755f04034e577b"
SRC_URI[sha256sum] = "3477f26d06aa82ea6eebb09154b20905c5b9895bb3b2d3ca55b003ea95193404"

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
    ${libdir}/libMuonCommon.so \
    ${libdir}/libMuonNotifiers.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
"
