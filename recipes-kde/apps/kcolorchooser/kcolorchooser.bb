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
SRC_URI[md5sum] = "88261bfd1983c0341abc1724dc31c255"
SRC_URI[sha256sum] = "7810437f7282eb9ad6491a5884a44c8ffd749940e4ffc85e3666e30b93b88cfc"

FILES_${PN} += " \
    ${datadir}/icons \
"
