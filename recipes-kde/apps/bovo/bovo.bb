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
SRC_URI[md5sum] = "6e6bdcf59c591c4499b2c26c05e0702b"
SRC_URI[sha256sum] = "f346055908a9c3c3670a7cc493e1d5903225d901e1171eeb01b8ddbd1aebda08"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"
