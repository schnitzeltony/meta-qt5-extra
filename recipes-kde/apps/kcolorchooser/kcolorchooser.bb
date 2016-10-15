SUMMARY = "A very small utility to select a color"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=838c366f69b72c5df05c96dff79b35f2 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    ki18n \
    kwidgetsaddons \
    kxmlgui \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "c7d1a5ece26f735f883075fe152e5299"
SRC_URI[sha256sum] = "b1283255b3e1fdf507186543f5f58a73da46c643be10a9eff49992a42b07baea"

FILES_${PN} += " \
    ${datadir}/icons \
"
