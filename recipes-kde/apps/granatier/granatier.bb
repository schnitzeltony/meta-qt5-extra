SUMMARY = "Granatier is a clone of the classic Bomberman game"
DESCRIPTION = "Granatier is a clone of the classic Bomberman game, inspired by the work of the Clanbomber clone"
LICENSE = "GFDL-1.2+ & GPL-2.0-or-later & LGPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kcoreaddons-native \
    kconfig-native \
    kdoctools-native \
    kcrash \
    kdbusaddons  \
    kwidgetsaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    knewstuff \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "a61f4198b8a14b2362bb425a70da662226cba5bf1f5c0812f97f5a47633d702a"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"
