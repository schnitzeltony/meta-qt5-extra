SUMMARY = "Bovo is a Gomoku like game for two players"
DESCRIPTION = "Bovo is a Gomoku (from Japanese 五目並べ - lit. 'five points') like game for two players, where the opponents alternate in placing their respective pictogram on the game board. (Also known as: Connect Five, Five in a row, X and O, Naughts and Crosses)"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=3c8ea28d12b8a786603a5394fc50096d \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "69f92585173e1b46e43f6efbf17921f4"
SRC_URI[sha256sum] = "dcbdcc4fec1a7f908256d71f85fa87fb3fde6cb4f1a3afb74184ef74257e34de"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
