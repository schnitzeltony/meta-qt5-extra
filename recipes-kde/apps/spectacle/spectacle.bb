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
SRC_URI[sha256sum] = "4a01b5ef41901ff2e83bb517c2e96a978188b98cb62243eb541a317f57a2bd69"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
    ${datadir}/kglobalaccel \
    ${datadir}/kconf_update \
    ${libdir}/kconf_update_bin \
"
