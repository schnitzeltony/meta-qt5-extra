SUMMARY = "The new screenshot capture utility, replaces KSnapshot"
LICENSE = "GFDL-1.2+ & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kpackage-native \
    kwidgetsaddons \
    kdbusaddons \
    knotifications \
    kdeclarative \
    ki18n \
    kio \
    kxmlgui \
    kwindowsystem \
    knewstuff \
"

# REVISIT optionals
DEPENDS += " \
    libkscreen \
    xcb-util-cursor \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "d9df24da53f2f12ca1f8cda62c9f3ab3a91132ab0e8ad87c0ccaabd99cf5c6a4"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
    ${datadir}/kglobalaccel \
    ${datadir}/kconf_update \
    ${systemd_user_unitdir} \
    ${libdir}/kconf_update_bin \
"
