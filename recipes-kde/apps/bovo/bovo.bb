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
SRC_URI[md5sum] = "daf32e09d4db587c67555b7e9c2e50a8"
SRC_URI[sha256sum] = "691a97d5e01526534b316cb888516a3163f614ba4a04a2148876b20dee91d17c"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
