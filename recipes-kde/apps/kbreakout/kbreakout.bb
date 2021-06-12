SUMMARY = "KBreakout: Destroy as many bricks as possible without losing the ball"
DESCRIPTION = "KBreakout is a Breakout-like game. Its objective is to destroy as many bricks as possible without losing the ball"
LICENSE = "GFDL-1.2+ & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps gettext

DEPENDS += "\
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    kdoctools-native \
    kcrash \
    kwidgetsaddons \
    kdbusaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "adc8ba63865b8dd6d6229b13bf94e1cdd53486f0cb21d0ef86369e5a07199cb3"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
