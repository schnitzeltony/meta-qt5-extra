SUMMARY = "KMines is the classic Minesweeper game"
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
    kconfigwidgets \
    kcrash \
    kdbusaddons  \
    ki18n \
    ktextwidgets \
    kwidgetsaddons  \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "ee0c16f73fbc0ac0ddf0f004136a966b"
SRC_URI[sha256sum] = "4ebb5d932ab43f11f81d0fa64aef871ffecaab4a2c3a5c4dbf10416a86fa8329"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/knotifications5 \
"
