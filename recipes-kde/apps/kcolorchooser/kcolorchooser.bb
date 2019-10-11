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
SRC_URI[md5sum] = "777f101de3bb45b624997de1edf56bbb"
SRC_URI[sha256sum] = "4eb50f314b190f1980e73212a45fe86db39f278f789288cd76cb0763f3176edc"

FILES_${PN} += " \
    ${datadir}/icons \
"
