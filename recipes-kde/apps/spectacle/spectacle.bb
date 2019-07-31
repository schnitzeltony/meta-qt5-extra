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
SRC_URI[md5sum] = "3984f30856c12e1e670db9d9ea0de2a9"
SRC_URI[sha256sum] = "bbf2c17298608dc69139f1f0a07de05b724d83cf57e8fe085a376723d83d15d1"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
"
