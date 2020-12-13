SUMMARY = "KBlocks - Falling Blocks Game"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kpackage-native \
    kcrash \
    kdbusaddons \
    kdeclarative \
    knewstuff \
    kxmlgui \
    libkmahjongg \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "8d73117b087476967775c6d8f8fd39901e06bc199c80cbceed6afd2f962492b9"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
