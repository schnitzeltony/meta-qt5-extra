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
    kcrash \
    kdbusaddons  \
    kwidgetsaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "cc3d4dc373c2a3cb04a87122f83ccb919b5c1d4418ec529c280aef532e94b6e0"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/knsrcfiles \
    ${datadir}/kxmlgui5 \
"
