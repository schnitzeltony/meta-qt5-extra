SUMMARY = "The new screenshot capture utility, replaces KSnapshot"
LICENSE = "GPLv2 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10ce6fc3438e5c4c933bfb5db3b097ec \
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
SRC_URI[md5sum] = "0619ee67d8c2ffdc521fcfd7b5a502a9"
SRC_URI[sha256sum] = "443f114dab1fb50e7e12a046fdf06c0456bf99a3abdf09dce05605fdf7d3de81"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
    ${datadir}/kglobalaccel \
    ${datadir}/kconf_update \
    ${libdir}/kconf_update_bin \
"
