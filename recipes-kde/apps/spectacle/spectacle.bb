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
SRC_URI[md5sum] = "fb5d80846c86b7cc9175f6fd2af5cdab"
SRC_URI[sha256sum] = "8b5cfbed8850643f774278b614771df0d27fe5e9eefd28765b76556358c245d5"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
"
