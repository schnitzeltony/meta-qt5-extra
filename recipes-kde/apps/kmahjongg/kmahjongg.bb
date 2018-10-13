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
SRC_URI[md5sum] = "c11443036d123e3d60a5f3d6841131be"
SRC_URI[sha256sum] = "37d6a508aaafe9ee1e078a28044b9d6b2e25f0ec8cb78649595c141ab7b2ec2c"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
