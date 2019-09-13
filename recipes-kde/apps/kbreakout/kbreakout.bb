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
SRC_URI[md5sum] = "af2d36a29e2007d67782abff460b63ff"
SRC_URI[sha256sum] = "1f086f6794b40c6054f0c00d7fbebecea845f2ee7e7e3253efe33942f4ebe19e"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
