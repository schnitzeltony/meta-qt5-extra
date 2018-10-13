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
SRC_URI[md5sum] = "a3634ce52a5d71def1b9c6e6fb2dd76a"
SRC_URI[sha256sum] = "3ec8b7546d9f2d1a142ea81d8e82b21cbfd4ed4dcb0f356d77397a08d69ca29b"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
