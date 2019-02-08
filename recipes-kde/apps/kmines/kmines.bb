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
SRC_URI[md5sum] = "8746cfc63565826c1d16af07c4ff06e8"
SRC_URI[sha256sum] = "9c38cfa24d3a99447cadbb5fac4ee858d61b037efb63018943e11c4eae3d6ad4"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/knotifications5 \
"
