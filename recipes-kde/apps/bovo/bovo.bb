SUMMARY = "Bovo is a Gomoku like game for two players"
DESCRIPTION = "Bovo is a Gomoku (from Japanese 五目並べ - lit. 'five points') like game for two players, where the opponents alternate in placing their respective pictogram on the game board. (Also known as: Connect Five, Five in a row, X and O, Naughts and Crosses)"
LICENSE = "GPL-2.0-only & GFDL-1.2"
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
SRC_URI[sha256sum] = "f681df51e3b00a982b10fae9a9e6ac705101f53cacbd418f747c58a5f4ff6653"

FILES:${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
