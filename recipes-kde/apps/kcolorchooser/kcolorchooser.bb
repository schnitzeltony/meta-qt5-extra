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
SRC_URI[md5sum] = "84638c4ce0743ebc283814841086094e"
SRC_URI[sha256sum] = "f62f37e52dd04fe1f871e72bc60fbb8584b5330d072246390c9b2c77b9b716d2"

FILES_${PN} += " \
    ${datadir}/icons \
"
