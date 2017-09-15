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
SRC_URI[md5sum] = "313d96a05d7ddd663116368e1b34f792"
SRC_URI[sha256sum] = "f194ffc1609585f00977d792a2f2227d04c1c9bd0581cd9e2d426696426abffe"

FILES_${PN} += " \
    ${datadir}/icons \
"
