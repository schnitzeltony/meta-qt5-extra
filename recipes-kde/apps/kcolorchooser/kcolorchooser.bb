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
SRC_URI[md5sum] = "edc6d65d8ed5c0a7c02e2eda2b78ab4c"
SRC_URI[sha256sum] = "8defdb9450922b675dc80561a0f4bb119e621a85dd73661fc4caacef8db91228"

FILES_${PN} += " \
    ${datadir}/icons \
"
