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
SRC_URI[md5sum] = "88f76540e4a957dde2f2b92235247524"
SRC_URI[sha256sum] = "dcd47af2c6ca366a74fda1dfb741530f4f256c52609a809b3c00bda46e80ff51"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/knotifications5 \
"
