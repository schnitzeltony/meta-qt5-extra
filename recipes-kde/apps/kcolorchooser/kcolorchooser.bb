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
SRC_URI[md5sum] = "53f9c5335dbbf062ee4b0b7ed9b64721"
SRC_URI[sha256sum] = "4eac41bd0b61513fcea1433ad297ce0300604964f35635b4d0edc4f3d1144a9d"

FILES_${PN} += " \
    ${datadir}/icons \
"
