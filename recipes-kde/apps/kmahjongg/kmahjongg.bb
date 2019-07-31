SUMMARY = "KBlocks - Falling Blocks Game"
LICENSE = "GPLv2 & GFDL-1.2"
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
SRC_URI[md5sum] = "9e2ba8e9faf27566089c3d2a198021b7"
SRC_URI[sha256sum] = "41bd533bf8d8b1e04451cb3c9165b08f9135603c0085d8b402d0e8e026b8ed00"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
