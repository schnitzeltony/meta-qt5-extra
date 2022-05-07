SUMMARY = "KBounce is a single player arcade game with the elements of puzzle"
DESCRIPTION = "KBounce is a single player arcade game with the elements of puzzle. It is played on a field, surrounded by wall, with two or more balls bouncing around within the walls. The object of the game is to build new walls to decrease the size of the active field."
LICENSE = "GFDL-1.2+ & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kdbusaddons  \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kiconthemes \
    kcompletion \
    ktextwidgets \
    kxmlgui \
    kio \
    knotifyconfig \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "49a567dacfcb488898b952b23e9e2233cd6e9ded43a89f73cdbf4fa1e40d6476"

FILES:${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
