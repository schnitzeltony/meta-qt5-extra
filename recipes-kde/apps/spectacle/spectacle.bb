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
SRC_URI[md5sum] = "7cda7b162410ad9fdcb1f28eb233c93a"
SRC_URI[sha256sum] = "31d4b00da13c9cc68b2d8f3c4633cba8e4ba82f819d3edac87aecd4fa70f31b3"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
"
