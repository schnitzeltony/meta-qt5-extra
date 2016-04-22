SUMMARY = "The new screenshot capture utility, replaces KSnapshot"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kcoreaddons \
    kwidgetsaddons \
    kdbusaddons \
    knotifications \
    kconfig \
    kdeclarative \
    ki18n \
    kio \
    kxmlgui \
    kwindowsystem \
    kdoctools \
"

# REVISIT optionals
DEPENDS += " \
    libkscreen \
    xcb-util-cursor \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "231a565255ff420b2a8b0974530b1c28"
SRC_URI[sha256sum] = "eab96b07eff41e98057ebbc3fb81d2ee6227559d0858d23ea82a8ad1e4ab1830"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
"
