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
SRC_URI[md5sum] = "0f4e37e1b4922f7482b523b35103b96e"
SRC_URI[sha256sum] = "cb0395c1b4f953fd51129cfe5088702ec261f84cc045f889e22c13e81793744a"

FILES_${PN} += " \
    ${datadir}/icons \
"
