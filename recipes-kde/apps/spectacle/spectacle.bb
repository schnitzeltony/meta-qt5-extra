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
SRC_URI[md5sum] = "c319447edf42728269b51c3d4ed45704"
SRC_URI[sha256sum] = "1e645572beb06ef3760b79b0199415e92da5f334e50e45d024f3bb825e127b46"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
"
