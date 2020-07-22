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
SRC_URI[md5sum] = "d12ddc7dea0953ffc29e27ca7fbfa40d"
SRC_URI[sha256sum] = "8a729ffd6406d7d6173fbd050e40a566b5ce4e7b960f3971fff82fef9c18c4d3"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/knotifications5 \
"
