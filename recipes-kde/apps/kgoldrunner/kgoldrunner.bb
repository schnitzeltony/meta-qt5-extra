SUMMARY = "A game of action and puzzle solving"
LICENSE = "GFDL-1.2+ & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kconfigwidgets \
    kcrash \
    kdbusaddons  \
    ki18n \
    kio \
    kwidgetsaddons \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "f5874bae4fef7d5c41e7218e84eea38da9f7de56dc9dcc2c35817b4ad5b84743"

FILES:${PN} += " \
    ${datadir}/knsrcfiles \
    ${datadir}/kxmlgui5 \
"
