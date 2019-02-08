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
SRC_URI[md5sum] = "5edd8c86a88cbcd1ae5e19502383d4e8"
SRC_URI[sha256sum] = "c69f2b67a419c901e4e359bb8ae1e712d7756952e690a36d6603662b1bb3b5b2"

FILES_${PN} += " \
    ${datadir}/icons \
"
