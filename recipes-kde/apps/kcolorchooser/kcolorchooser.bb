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
SRC_URI[md5sum] = "81a13675f20367e6e636bb7fa21013a4"
SRC_URI[sha256sum] = "d62d95b782e887f038413fe9806450658da6172241e708a975335ba13279980a"

FILES_${PN} += " \
    ${datadir}/icons \
"
