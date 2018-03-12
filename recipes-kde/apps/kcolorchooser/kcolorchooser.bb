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
SRC_URI[md5sum] = "b7c26d70a8bd83e5b70f75535af46989"
SRC_URI[sha256sum] = "d4a3df598ab18fa393c383d72528a399dcc2e33d3494a8fe4db098d67f5cc8f9"

FILES_${PN} += " \
    ${datadir}/icons \
"
