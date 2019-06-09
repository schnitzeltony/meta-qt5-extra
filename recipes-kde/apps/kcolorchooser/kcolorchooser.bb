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
SRC_URI[md5sum] = "2f92d3643160e24b24f624256713ba26"
SRC_URI[sha256sum] = "a405dde1a0e0f63a14c9f5aae62a7638374162dcdc394d86412d42036a8441de"

FILES_${PN} += " \
    ${datadir}/icons \
"
