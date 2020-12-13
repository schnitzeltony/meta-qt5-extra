SUMMARY = "Bovo is a Gomoku like game for two players"
DESCRIPTION = "Bovo is a Gomoku (from Japanese 五目並べ - lit. 'five points') like game for two players, where the opponents alternate in placing their respective pictogram on the game board. (Also known as: Connect Five, Five in a row, X and O, Naughts and Crosses)"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=3c8ea28d12b8a786603a5394fc50096d \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "1ff3609c1d2c1a7afd9d87b27bb5b78f83df7fc221f8ac86aa1d546306530ba3"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
