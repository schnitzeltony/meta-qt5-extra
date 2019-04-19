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
SRC_URI[md5sum] = "abecb96e56f4abf1e9651b200a3a3ac0"
SRC_URI[sha256sum] = "8f338ba51349cb056f25266d884ca318d3fd3933288ec96f9f17df6c842bc839"

FILES_${PN} += " \
    ${datadir}/icons \
"
