SUMMARY = "Granatier is a clone of the classic Bomberman game"
DESCRIPTION = "Granatier is a clone of the classic Bomberman game, inspired by the work of the Clanbomber clone"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kcoreaddons-native \
    kconfig-native \
    kdoctools-native \
    kcrash \
    kdbusaddons  \
    kwidgetsaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    knewstuff \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "d90669e38ee1b768a8706f882a3201d1"
SRC_URI[sha256sum] = "368bfadf8cd2111efade7a8fa35ee956e2150d3cbd4237473325ceaec455950a"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
