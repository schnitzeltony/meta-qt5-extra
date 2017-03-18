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
SRC_URI[md5sum] = "e41adc7c97237ad8aacac78c1c0d0d0a"
SRC_URI[sha256sum] = "a64fa9f748e41ad63b65039aa447faf1bcdb418da0a1f81366f1e95454388ab9"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/khotkeys \
    ${datadir}/knotifications5 \
"
