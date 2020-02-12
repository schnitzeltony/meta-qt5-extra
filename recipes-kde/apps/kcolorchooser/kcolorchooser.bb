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
SRC_URI[md5sum] = "96ebe74b1ae9531f8bd1234f8aa0a3e9"
SRC_URI[sha256sum] = "2769bf1bc8240a07ea5e42e59f4b97f88546668b628e6b42d0fd1fb769ee1449"

FILES_${PN} += " \
    ${datadir}/icons \
"
