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
SRC_URI[md5sum] = "8e8d747892f69d1aa10290449541132b"
SRC_URI[sha256sum] = "f60ee47baaca59b7df8ce58902ae09d44d2cb5b7f3f5ec7b9a401c7f7e3e5ab4"

FILES_${PN} += " \
    ${datadir}/icons \
"
