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
SRC_URI[md5sum] = "056efb8d201323d5a56a7628f9d456ff"
SRC_URI[sha256sum] = "b3ba3f202383131568d41a1f0d29305a6f36c19a52d1dfb6f7afc4d48a304c4c"

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
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/${QT_DIR_NAME}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/*/.debug \
    ${libdir}/${QT_DIR_NAME}/qml/org/kde/*/.debug \
"
