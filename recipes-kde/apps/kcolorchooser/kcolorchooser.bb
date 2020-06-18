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
SRC_URI[md5sum] = "7cac60e0cc487310a1e93a531d3a7f7e"
SRC_URI[sha256sum] = "155a01e032fbb5c3bcd537ed872fcf09bc6f001b5d01c867e6ae4f10b07967de"

FILES_${PN} += " \
    ${datadir}/icons \
"
