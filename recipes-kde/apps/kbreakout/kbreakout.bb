SUMMARY = "KBreakout: Destroy as many bricks as possible without losing the ball"
DESCRIPTION = "KBreakout is a Breakout-like game. Its objective is to destroy as many bricks as possible without losing the ball"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    kdoctools-native \
    kcrash \
    kwidgetsaddons \
    kdbusaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b236415996fc0fd78a376e0bc12bf01b"
SRC_URI[sha256sum] = "4e9bd79060d826d99573e3db364005b32d70643b0fe0d7c5e427fb1c8a34896b"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
