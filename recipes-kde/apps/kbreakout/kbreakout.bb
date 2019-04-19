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
SRC_URI[md5sum] = "4b368347de30dffcc6750730a80c10b1"
SRC_URI[sha256sum] = "c4aa847def701be288e53ceb27c8c63c34aa527f8e64c91fb007d053b1119db8"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
