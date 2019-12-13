SUMMARY = "KDiamond is a single player puzzle game"
DESCRIPTION = "KDiamond is a single player puzzle game. The object of the game is to build lines of three similar diamonds."
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    kwidgetsaddons \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kiconthemes \
    kxmlgui \
    knotifications \
    knotifyconfig \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "daa9a5d3569ada3175b2ca6bbc1c0c10"
SRC_URI[sha256sum] = "bf51e52679ad35083e0d6ad838451365d89bb9e83743cc2c1f40313fc6d473a3"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
"
