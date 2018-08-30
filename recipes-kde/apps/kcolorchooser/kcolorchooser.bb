SUMMARY = "A very small utility to select a color"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "7876e108b9fb2ff0deea2a18f33bd1f2"
SRC_URI[sha256sum] = "741cf9f7a6e59bcf2118f9eb69db7f35384d8153f886b9f2721ed46b99e9b4eb"

FILES_${PN} += " \
    ${datadir}/icons \
"
