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
SRC_URI[md5sum] = "c3e4d1f1fb8e9a3a0fadbb1ef566c18a"
SRC_URI[sha256sum] = "75e949a12e25759b3f4769e06e7b665a290762741477bc5ee55c827f874afef3"

FILES_${PN} += " \
    ${datadir}/icons \
"
