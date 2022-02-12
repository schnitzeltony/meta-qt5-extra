SUMMARY = "Mathematical Function Plotter"
LICENSE = "GFDL-1.2 & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    qtsvg \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kcrash \
    kguiaddons \
    ki18n \
    kparts \
    kwidgetsaddons \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "bacfc4cbba688acdab4426d30b1b65443b8ec8bbe8346de730d996787428b608"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
