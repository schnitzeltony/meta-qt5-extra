SUMMARY = "KPat offers a selection of solitaire card games"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=dcd3ae65d2d4ac9f347f0614d3fd4794 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache mime mime-xdg

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
SRC_URI[md5sum] = "5202aaa74a4ac581e7c0ad370435a23c"
SRC_URI[sha256sum] = "bad46abf7aec96399488b513b5aadc80bb198c8d3cfbd63db5141b1b37357481"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/mime \
    ${datadir}/kxmlgui5 \
    ${libdir}/libkcardgame.so \
"
