SUMMARY = "KPat offers a selection of solitaire card games"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=dcd3ae65d2d4ac9f347f0614d3fd4794 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache mime

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kcompletion \
    kconfigwidgets \
    kcrash \
    kdbusaddons  \
    kguiaddons  \
    ki18n \
    kio \
    knewstuff \
    kwidgetsaddons  \
    kxmlgui \
    libkdegames \
    freecell-solver \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "90094d62dd7307a337b4b8e9e020e1e2"
SRC_URI[sha256sum] = "bbead384a9c9d81656595c4bc5952ea9f4399f633fb7b9bb50d497789087f2e6"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/mime \
    ${datadir}/kxmlgui5 \
    ${libdir}/libkcardgame.so \
"
